(ns mafia-votecount.routes.home
  (:require [compojure.core :refer :all]
            [mafia-votecount.views.layout :as layout]))

(defn home []
  (layout/common [:h1 "Hello World!"]))

(defroutes home-routes
  (GET "/" [] (home)))
