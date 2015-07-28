(ns mafia-votecount.routes.home
  (:use ring.util.response)
  (:require [compojure.core :refer :all]
            [mafia-votecount.views.create-game :as create-game]
            [mafia-votecount.views.games :as games]
            [mafia-votecount.views.game :as game]
            [mafia-votecount.scraper.team-liquid :as scraper]))

(defroutes home-routes
  (GET "/" [] (resource-response "index.html" {:root "public"}))
  (GET "/games" request games/games-resource)
  (GET "/game/:id" [id] (game/game-resource id))
  (POST "/delete-player" [id] (player/delete-player id))
  (POST "/create-game" [url hosts players]
        (create-game/add-game url hosts players)))
