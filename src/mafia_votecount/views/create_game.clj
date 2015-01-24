(ns mafia-votecount.views.create-game
  (:refer-clojure :exclude [resolve])
  (:use clojurewerkz.urly.core)
  (:require [clojure.string]
            [mafia-votecount.models :as models]
            [mafia-votecount.scraper.team-liquid :as scraper]))

(defn- get-game-id [url]
  (-> (path-of url)
    (clojure.string/split #"/")
    (nth 3)))

(defn- add-players [game-id players-string]
  (let [players (clojure.string/split players-string #"\s+")]
    (models/add-players game-id players)))

(defn add-game [url-string hoster-name players-string]
  (let [url (url-like url-string)]
    (if (and (not (nil? url)) (.endsWith (host-of url) "teamliquid.net"))
      (let [game-id (get-game-id url)]
            (if-not (models/has-game game-id)
              (do 
                (models/add-game game-id (scraper/get-game-title url) url)
                (add-players game-id players-string))
              nil))
      nil)))
