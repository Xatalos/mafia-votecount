(ns mafia-votecount.views.create-game
  (:refer-clojure :exclude [resolve])
  (:use [clojurewerkz.urly.core] [clojure.pprint])
  (:require [clojure.tools.logging :as log]
   [clojure.string :as string]
            [mafia-votecount.models :as models]
            [mafia-votecount.scraper.team-liquid :as scraper]))

(defn- get-game-id [url]
  (-> (path-of url)
      (clojure.string/split #"/")
      (nth 3)))

(defn- add-players [game-id players-string]
  (->> (map string/trim (string/split-lines players-string))
    (models/add-players game-id)))

(defn- scan-all-votes [id]
  (let [hosts (models/get-hosts id)
        url (models/get-game-url id)
        scan-data (scraper/scan-all-votes-after url hosts 1 0 :none)
        nothing (pprint (dissoc scan-data :votes))]
    (do (-> (map #(assoc % :game id) (:votes scan-data))
            (models/add-votes))
        (models/update-game id
                            (:last-index scan-data)
                            (:cycle-number scan-data)
                            (name (:cycle-type scan-data))))))

(defn add-game [url-string hosts-string players-string]
  (let [url (url-like url-string)
        hosts (map string/trim (string/split-lines hosts-string))]
    (if (and (not (nil? url)) (.endsWith (host-of url) "teamliquid.net"))
      (let [game-id (get-game-id url)]
            (if-not (models/has-game game-id)
              (do
                (future
                  (try
                    (do
                     (models/add-game game-id (scraper/get-game-title url) url)
                     (models/add-hosts game-id hosts)
                     (add-players game-id players-string)
                     (scan-all-votes game-id)
                     (log/info "Succesfully added game"))
                    (catch Exception e
                      (log/error e "Failed to scan game"))))
                "Game is being added. Scanning may take long time")
              "Game is already in database"))
      "Invalid url")))
