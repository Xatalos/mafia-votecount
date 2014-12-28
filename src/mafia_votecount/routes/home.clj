(ns mafia-votecount.routes.home
  (:use ring.util.response)
  (:require [compojure.core :refer :all]
            [mafia-votecount.views.layout :as layout]
            [mafia-votecount.resources :as my-resources]))

(defroutes home-routes
  (GET "/" [] (resource-response "index.html" {:root "public"}))
  (GET "/games" request my-resources/game-data))
