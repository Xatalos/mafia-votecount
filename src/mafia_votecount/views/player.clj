(ns mafia-votecount.views.player
  (:require [mafia-votecount.models :as models]))

(defn delete-player [id]
  (models/delete-player-by-id id))
  
(defn add-player [game name]
  (models/add-player game name))
