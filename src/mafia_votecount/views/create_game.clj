(ns mafia-votecount.views.create-game
  (:refer-clojure :exclude [resolve])
  (:use clojurewerkz.urly.core)
  (:require [clojure.string :as string]
            [mafia-votecount.models :as models]
            [mafia-votecount.scraper.team-liquid :as scraper]))

(defn- get-game-id [url]
  (-> (path-of url)
    (clojure.string/split #"/")
    (nth 3)))

(defn- add-players [game-id players-string]
  (->> (map string/trim (string/split-lines players-string))
    (models/add-players game-id)))

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
