(ns mafia-votecount.scraper.team-liquid
  (:require [net.cgrand.enlive-html :as html]
            [clojurewerkz.urly.core :as urly]
            [clj-http.client :as client]
            [clojure.string :as string]
            [clojure.set]
            [clojure.zip :as zip])
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

(defn- has-quote? [part]
  (and (map? (:attrs part))
       (if-some [css-class (-> (:attrs part) (:class))]
         (.contains css-class "quote")
         nil)))

(defn- has-spoiler? [part]
  (let [stuff 0]
   (and (map? (:attrs part))
        (if-some [id (-> (:attrs part) (:id))]
          (.contains id "spoiler")
          nil))))

(defn death-to-quotes [loc]
  (if (zip/end? loc)
    loc
    (if (or (has-quote? (zip/node loc)) (has-spoiler? (zip/node loc)))
      (recur (zip/next (zip/remove loc)))
      (recur (zip/next loc)))))


;; (defn- remove-quotes [message]
;;   (remove
;;    #(and (map? %) (or (has-quote? %) (has-spoiler? %))) message))

(defn- remove-quotes [message]
  (let [zipped (zip/seq-zip message)]
    (zip/root (death-to-quotes zipped))))

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
  (do (Thread/sleep 1000)
      (get-user-message-pairs content)))

(defn- get-player-message-maps [path]
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
       (remove string/blank?)
       (first)
       (string/trim)
       (vector)
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

(defn content-flatter [li]
  (->>
   (map
    (fn [val]
      (cond
        (string? val) val
        :else (content-flatter (:content val))))
    li)
   (flatten)
   (remove nil?)))

(defn- has-vote? [message-part]
  (->> (html/text message-part)
       (.toLowerCase)
       ((fn [html-text]
          (or (.contains html-text "#vote") (.contains html-text "#unvote"))))))

(defn- analyze-vote [part]
  (if (.contains (.toLowerCase part) "#unvote")
    {:unvote true :target ""}
    (-> (string/split part #"(?i)#+vote:?")
        (last)
        (#(if (and (string? %) (< (.length %) 21))
            (string/trim %)))
        ((fn [target]
           {:target
            target})))))

(defn- get-votes-from-message [index-user-message-pair]
  (let [user-message-pair (last index-user-message-pair)
        index (first index-user-message-pair)
        user (:user user-message-pair)
        parts (filter has-vote? (:message user-message-pair))
        text-parts (content-flatter parts)]
    (map #(merge {:index index :voter user} %)
         (map-indexed #(merge {:subindex %1} (analyze-vote %2)) text-parts))))

(defn- vote-cmp [v1 v2]
  (let [i1 (:index v1)
        i2 (:index v2)]
    (cond
      (< i1 i2) true
      (= i1 i2) (< (:subindex v1) (:subindex v2))
      :else false)))

(defn- get-votes-in-range [indexed start-end]
  (let [posts (select-keys indexed
                           (range (first start-end)
                                  (if (empty? (rest start-end))
                                    (last (keys indexed))
                                    (inc (last start-end)))))]
    (->> (mapcat get-votes-from-message posts)
         (sort vote-cmp)
         (map #(dissoc % :subindex)))))

(defn- days-into-votes [days votes-by-days]
  (flatten (map (fn [day votes-of-day]
                  (map #(assoc % :day day) votes-of-day))
                days votes-by-days)))

;; (defn- days-into-votes [votes-by-days]
;;   (mapcat (fn [day-and-votes]
;;             (let [day (first day-and-votes)
;;                   votes (second day-and-votes)]
;;               (map #(assoc  % :day day) votes)))
;;           votes-by-days))

(defn- scan-votes [player-message-maps hosts]
  (let [indexed (enumerate player-message-maps)
        day-ranges (-> (cycle-changes indexed hosts)
                       (keys)
                       (to-day-ranges))]
    (days-into-votes (range 1 (inc (count day-ranges)))
                     (map #(get-votes-in-range indexed %) day-ranges))))

(defn scan-all-votes [url hosts]
  (let [player-message-maps (get-player-message-maps url)]
    (scan-votes player-message-maps hosts)))
