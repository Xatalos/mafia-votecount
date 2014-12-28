(ns mafia-votecount.resources
  (:require [liberator.core :refer
             [defresource resource request-method-in]]))

(defn give-game-toy-data [& _]
  (slurp "resources/data/toy-game-data.json"))

(defresource game-data
  :handle-ok give-game-toy-data
  :available-media-types ["application/json"])
