(ns mafia-votecount.routes.home
  (:use ring.util.response)
  (:require [compojure.core :refer :all]
            [mafia-votecount.views.create-game :as create-game]
            [mafia-votecount.scraper.team-liquid :as scraper]
            [mafia-votecount.resources :as my-resources]))

(defroutes home-routes
  (GET "/" [] (resource-response "index.html" {:root "public"}))
  (GET "/games" request my-resources/game-data)
  (POST "/create-game" [url hoster-name] (create-game/add-game url hoster-name)))
