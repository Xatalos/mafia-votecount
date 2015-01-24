(ns mafia-votecount.routes.home
  (:use ring.util.response)
  (:require [compojure.core :refer :all]
            [mafia-votecount.views.create-game :as create-game]
            [mafia-votecount.views.games :as games]
            [mafia-votecount.scraper.team-liquid :as scraper]))

(defroutes home-routes
  (GET "/" [] (resource-response "index.html" {:root "public"}))
  (GET "/games" request games/games-resource)
  (POST "/create-game" [url hoster-name players] (create-game/add-game url hoster-name players)))
