(ns mafia-votecount.scraper.team-liquid
  (:require [net.cgrand.enlive-html :as html])
  (:require [clojurewerkz.urly.core :as urly])
  (:import [java.net URL URLConnection])
  (:gen-class))

(defn- fetch-page [path]
  (if-not (.contains path "teamliquid.net/forum/") nil
    (try
      (let [connection (. (URL. path) openConnection)]
        (cond (not (.contains (.getContentType connection) "text/html")) nil
              (> (.getContentLengthLong connection) 1048576) nil ;; Over megabyte
              :else (html/html-resource (java.io.StringReader. (slurp path)))))
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

(defn- has-class [part]
  (and (map? (:attrs part))
       (if-some [css-class (-> (:attrs part) (:class))]
         (.contains css-class "quote")
         nil)))

(defn- remove-quotes [message]
  (remove
   #(and (map? %) (has-class %)) message))

(defn- pair-users-messages [users messages]
  (map (fn [user message] {:user user :message (remove-quotes message)})
       users messages))

(defn- fetch-certain-page [url page-num]
  (-> (urly/url-like url)
    (.withoutQuery)
    (urly/mutate-query (format "page=%s" page-num))
    (str)
    (fetch-page)))

(defn get-game-title [url]
  (-> (fetch-certain-page url 1)
    (html/select [:h1.title])
    (nth 0)
    (html/text)))

(defn get-player-message-maps [path]
  (some->> (fetch-page path)
       (only-main-content)
       (get-forum-posts)
       (#(pair-users-messages (extract-users %) (extract-messages %)))))
