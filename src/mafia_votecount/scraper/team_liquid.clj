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

(def ^:private ^:const POSTS-PER-PAGE 20)

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
   content [[:section (html/has [[:article.forumPost]])]]))

(defn- extract-users [posts]
  (map #(-> (:content %) (nth 1) (:content) (first))
       (html/select posts [[:div.fpost-username]])))

(defn- extract-messages [posts]
  (map #(:content %) (html/select posts [:.forumPost :> :section])))

(defn- get-page-number-bar [content]
  (-> (html/select content [:.pagination :* ])
      ((fn [pages] (map #(first (get % :content)) pages)))))

(defn parse-int [v]
   (try
     (Integer/parseInt v)
     (catch NumberFormatException e 1)))

(defn- get-page-numbers [content]
  (let [page-number-bar (get-page-number-bar content)
        last-page  (->> (reverse page-number-bar)
                        (filter #(Character/isDigit (first %))) ;; Filter is lazy
                        (first)
                        (parse-int))]
    (vec (range 1 (inc last-page)))))

(defn- has-quote? [part]
  (and (map? (:attrs part))
       (if-some [css-class (-> (:attrs part) (:class))]
         (.contains css-class "quote")
         nil)))

(defn- has-spoiler? [part]
  (and (map? (:attrs part))
       (if-some [id (-> (:attrs part) (:id))]
         (.contains id "spoiler")
         nil)))

(defn- death-to-quotes [loc]
  (if (zip/end? loc)
    loc
    (if (or (has-quote? (zip/node loc)) (has-spoiler? (zip/node loc)))
      (recur (zip/next (zip/remove loc)))
      (recur (zip/next loc)))))


(defn- remove-top-level-quotes [message]
  (remove
   #(and (map? %) (or (has-quote? %) (has-spoiler? %))) message))

(defn- remove-quotes [message]
  (map #(-> (zip/xml-zip %)
            (death-to-quotes)
            (zip/root))
       (remove-top-level-quotes message)))

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

(defn- parse-and-wait [content first-index]
  (do (Thread/sleep 1000)
      (get-user-message-pairs content)))

(defn- get-player-message-maps [path first-index]
  (let [first-page (inc (quot (dec first-index) POSTS-PER-PAGE))]
   (some->>
    (fetch-certain-page path 1)
    (only-main-content)
    (get-page-numbers)
    (#(nthrest % (dec first-page)))
    ((fn [page-numbers]
       (map #(-> (fetch-certain-page path %)
                 (parse-and-wait first-index))
            page-numbers)))
    (flatten))))

(defn- enumerate [posts first-page-index]
  (->> (map-indexed #(vector (+ first-page-index %1) %2) posts)
       (into (sorted-map))))

(defn- is-host? [index-post hosts]
  (contains? hosts (:user (val index-post))))

(defn- is-cycle-change? [message]
  (some->> (map html/text message)
           (remove string/blank?)
           (first)
           (string/trim)
           (vector)
           (some #(let [lowercased (string/lower-case %)]
                     (cond
                         (and
                           (.startsWith lowercased "day ")
                           (not (.contains lowercased "vot"))) :day
                         (and
                           (.startsWith lowercased "night ")
                           (not (.contains lowercased "vot"))) :night
                         :else false)))))

(defn- cycle-changes [indexed hosts]
  (filter #(and (is-host? % hosts) (= :day (is-cycle-change? (:message (val %)))))
          indexed))

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
                 (drop 1 left))))))

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
    {:target ""}
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
  (if (empty? indexed)
    '()
    (let [posts (select-keys indexed
                            (range (first start-end)
                                   (inc (if (empty? (rest start-end))
                                          (last (keys indexed))
                                          (last start-end)))))]
     (->> (mapcat get-votes-from-message posts)
          (sort vote-cmp)
          (map #(dissoc % :subindex))))))

(defn- days-into-votes [days votes-by-days]
  (flatten (map (fn [day votes-of-day]
                  (map #(assoc % :day day) votes-of-day))
                days votes-by-days)))

(defn- last-cycle-type [previous day-ranges]
  (case (count (last day-ranges))
    0 (if (= previous :none) :none previous)
    1 :day
    2 :night
    :last-cycle-error)) ;; This should never happen

(defn- last-cycle-number [previous-number previous-type day-ranges]
  (+ previous-number
     (count day-ranges)
     (if (= previous-type :day) -1 0)))

(defn- get-first-day [cycle-number cycle-type]
  (+ cycle-number (if (= cycle-type :day) 0 1)))

(defn- scan-votes [player-message-maps hosts first-index cycle-number cycle-type]
  (let [first-page-index (inc (* (quot (dec first-index) POSTS-PER-PAGE) POSTS-PER-PAGE))
        indexed (->> (enumerate player-message-maps first-page-index)
                     (drop-while #(< (first %) first-index))
                     (into (sorted-map)))
        cycle-posts (cycle-changes indexed hosts)
        day-ranges (-> cycle-posts
                       (keys)
                       (#(if (= cycle-type :day)
                           (cons (dec first-index) %)
                           %))
                       (to-day-ranges))
        last-cycle-type (last-cycle-type cycle-type day-ranges)]
    {:cycle-number (last-cycle-number cycle-number cycle-type day-ranges)
     :last-index (-> indexed (last) (first) (#(if % % (dec first-index))))
     :cycle-type last-cycle-type
     :votes (days-into-votes (range (get-first-day cycle-number cycle-type)
                                    (+ cycle-number (count day-ranges) 1))
                             (map #(get-votes-in-range indexed %) day-ranges))}))

(defn scan-all-votes-after [url hosts first-index cycle-number cycle-type]
  (let [player-message-maps (get-player-message-maps url first-index)
        nothing (println "Called scan-all-votes-after:" url hosts first-index cycle-number cycle-type)]
    (scan-votes player-message-maps hosts first-index cycle-number cycle-type)))
