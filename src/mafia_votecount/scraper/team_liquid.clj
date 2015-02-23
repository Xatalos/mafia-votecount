(ns mafia-votecount.scraper.team-liquid
  (:require [net.cgrand.enlive-html :as html]
            [clojurewerkz.urly.core :as urly]
            [clj-http.client :as client]
            [clojure.string :as string])
  (:use [clojure.pprint])
  (:import [java.net URL URLConnection])
  (:gen-class))

(def ^:private user-agent "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:35.0) Gecko/20100101 Firefox/35.0")

(def ^:private request-header
  {"User-Agent" user-agent})

(defn- fetch-page [path]
  (if-not (.contains path "teamliquid.net/forum/") nil
    (try
      (let [connection (. (URL. path) openConnection)]
        (cond (not (.contains (.getContentType connection) "text/html")) nil
              (> (.getContentLengthLong connection) 1048576) nil ;; Over megabyte
              :else (html/html-resource
                     (java.io.StringReader.
                      (:body (client/get path {:headers request-header}))))))
      (catch Exception ex (println ex)))))

(defn- only-main-content [resource]
  (html/select resource [:div#main-content]))

(defn- get-forum-posts [content]
  (html/select
   content [[:table.solid (html/has [[:a (html/attr? :data-post)]])]]))

(defn- extract-users [posts]
  (map #(-> (get % :attrs) (get :data-user)) (html/select posts [[:a (html/attr? :data-user)]])))

(defn- extract-messages [posts]
  (map #(:content %) (html/select posts [[:.forumPost]])))

(defn- get-page-number-bar [content]
  (-> (html/select content [:table :tr ])
      (nth 0)
      (get :content)
      (nth 3)
      (get :content)
      ((fn [pages] (remove string? pages)))
      ((fn [pages] (map #(first (get % :content)) pages)))))

(defn- get-page-numbers [content]
  (let [page-number-bar (get-page-number-bar content)
        last-page  (->> (reverse page-number-bar)
                        (filter #(Character/isDigit (first %))) ;; Filter is lazy
                        (first)
                        (Integer/parseInt))]
    (vec (range 1 (inc last-page)))))

(defn- has-class? [part]
  (and (map? (:attrs part))
       (if-some [css-class (-> (:attrs part) (:class))]
         (.contains css-class "quote")
         nil)))

(defn- remove-quotes [message]
  (remove
   #(and (map? %) (has-class? %)) message))

(defn- pair-users-messages [users messages]
  (map (fn [user message] {:user user :message (remove-quotes message)})
       users messages))

(defn- url-without-query [url]
  (.withoutQuery (urly/url-like url)))

(defn- fetch-certain-page [url page-num]
  (-> (url-without-query url)
    (urly/mutate-query (format "page=%s" page-num))
    (str)
    (fetch-page)))

(defn get-game-title [url]
  (-> (fetch-certain-page url 1)
    (html/select [:h1.title])
    (nth 0)
    (html/text)))

(defn- get-user-message-pairs [content]
  (->> (only-main-content content)
   (get-forum-posts)
   (#(pair-users-messages (extract-users %) (extract-messages %)))))

(defn- parse-and-wait [content]
  (do (Thread/sleep 2000)
      (get-user-message-pairs content)))

(defn get-player-message-maps [path]
  (some->>
   (fetch-certain-page path 1)
   (only-main-content)
   (get-page-numbers)
   ((fn [page-numbers]
      (map #(-> (fetch-certain-page path %)
                (parse-and-wait))
            page-numbers)))
   (flatten)))

(defn- enumerate [posts]
  (->> (map-indexed #(vector (inc %1) %2) posts)
       (into (sorted-map))))

(defn- is-host? [index-post hosts]
  (contains? hosts (:user (val index-post))))

(defn- is-cycle-change? [message]
  (->> (map html/text message)
       (some #(let [lowercased (string/lower-case %)]
                (or (.startsWith lowercased "day ")
                    (.startsWith lowercased "night "))))))

(defn- cycle-changes [indexed hosts]
  (filter #(and (is-host? % hosts) (is-cycle-change? (:message (val %))))
          (rest indexed)))

(defn- dec-or-nil [num]
  (if (nil? num)
    nil
    (dec num)))

(defn- to-day-ranges [cycle-change-indices]
  (loop [pairs []
         left cycle-change-indices]
    (if (empty? left) pairs
        (let [next (take 2 left)
              start (inc (first next))
              end (first (rest next))]
          (recur (conj pairs (remove nil? [start (dec-or-nil end)]))
                 (drop 2 left))))))

(defn- has-vote? [message-part]
  (->> (html/text message-part)
       (.toLowerCase)
       ((fn [html-text]
          (or (.contains html-text "#vote") (.contains html-text "#unvote"))))))

(defn- analyze-vote [part]
  (if (.contains (.toLowerCase part) "#unvote")
    {:unvote true}
    (-> (string/replace-first part #"(?i)#+vote:?" "")
        (string/trim)
        ((fn [target] {:vote true :target target})))))

(defn- get-votes-from-message [user-message-pair]
  (let [user (:user user-message-pair)
        parts (filter has-vote? (:message user-message-pair))]
    (map #(merge {:user user} %) parts)))

(defn- get-votes-in-range [indexed start-end]
  (let [posts (select-keys indexed
                           (range (first start-end)
                                  (if (empty (rest start-end))
                                    (last indexed)
                                    (inc (last start-end)))))]
    (mapcat get-votes-from-message (vals posts))))

(defn get-votes [player-message-maps hosts]
  (let [indexed (enumerate player-message-maps)
        day-ranges (-> (cycle-changes indexed hosts)
                       (keys)
                       (to-day-ranges))]
    (mapcat #(get-votes-in-range indexed %) day-ranges)))
