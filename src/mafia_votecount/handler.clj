(ns mafia-votecount.handler
  (:require [compojure.core :refer [defroutes routes]]
            [ring.middleware.resource :refer [wrap-resource]]
            [ring.middleware.file-info :refer [wrap-file-info]]
            [hiccup.middleware :refer [wrap-base-url]]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.adapter.jetty :as jetty]
            [mafia-votecount.routes.home :refer [home-routes]]))

(defn init []
  (println "mafia-votecount is starting"))

(defn destroy []
  (println "mafia-votecount is shutting down"))

(defroutes app-routes
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (routes home-routes app-routes)
      (handler/site)
      (wrap-base-url)))

(defn -main [& [port]]
  (let [port (if port (Integer/parseInt port) 8080)]
    (jetty/run-jetty (app) {:port port :join? false})))
