(ns mafia-votecount.views.games
  (:require [cheshire.core :as json-core]
            [mafia-votecount.models :as models]
            [liberator.core :refer [defresource resource request-method-in]]))

(defn- games-as-json []
  (json-core/generate-string {:games (models/get-games)}))

(defresource games-resource
  :handle-ok (fn [_] (games-as-json))
  :available-media-types ["application/json"])