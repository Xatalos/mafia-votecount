(ns mafia-votecount.views.game
  (:use [clojure.pprint])
  (:require [cheshire.core :as json-core]
            [mafia-votecount.models :as models]
            [liberator.core :refer [defresource resource request-method-in]]))

(defn- game-as-json [id]
  (let [game (models/get-game-by-id id)
        players (models/get-players id)]
    (json-core/generate-string
      {:found (not (nil? game))
       :game game
       :players players
       :hosts (models/get-hosts id)
       :votes (models/get-votes id)})))

(defresource game-resource [id]
  :handle-ok (fn [_] (game-as-json id))
  :available-media-types ["application/json"])

(defn delete-game [id]
  (models/delete-game-by-id id))
