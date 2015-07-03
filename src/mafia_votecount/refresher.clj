(ns mafia-votecount.refresher
  (:require [cheshire.core :as json-core]
            [mafia-votecount.models :as models]
            [mafia-votecount.scraper.team-liquid :as scraper]
            [clojure.tools.logging :as log])
  (:gen-class))

(defn- refresh-game [game]
  (let [hosts (models/get-hosts (:id game))
        nothing (log/info "Info about game before update:"
                          game)
        refreshed (scraper/scan-all-votes-after
                   (:url game)
                   hosts
                   (inc (:last_index game))
                   (:cycle_number game)
                   (keyword (:cycle_type game)))]
    (do ;; (log/info "Posts between: " (- (:last-index refreshed) (:last_index game)))
        (log/info refreshed)
        (models/update-game (:id game)
                            (:last-index refreshed)
                            (:cycle-number refreshed)
                            (name (:cycle-type refreshed)))
        (-> (map #(assoc % :game (:id game)) (:votes refreshed))
            (models/add-votes)))))

(defn refresh []
  (try
    (do (log/info "Trying to refresh")
        (let [games (models/get-games)
              updateable-games (remove #(= (:last_index %) 0) games)]
          (dorun (map refresh-game updateable-games))))
    (catch Exception e
      (log/error e "Failed to refresh"))))
