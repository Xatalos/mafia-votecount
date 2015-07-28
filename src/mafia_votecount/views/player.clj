(ns mafia-votecount.views.player
  (:require [mafia-votecount.models :as models]
            [liberator.core :refer [defresource resource request-method-in]]))

(defn- delete-player [id]
  (models/delete-player-by-id id))
