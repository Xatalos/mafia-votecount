(ns mafia-votecount.views.create-game
  (:refer-clojure :exclude [resolve])
  (:use clojurewerkz.urly.core)
  (:require [clojure.string]
            [mafia-votecount.models.modify :as modify]
            [mafia-votecount.scraper.team-liquid :as scraper]))

(defn- get-game-id [url]
  (-> (path-of url)
    (clojure.string/split #"/")
    (nth 3)))

(defn add-game [url-string hoster-name]
  (let [url (url-like url-string)]
    (if (.endsWith (host-of url) "teamliquid.net")
      (let [game-id (get-game-id url)]
            (if-not (modify/has-game game-id)
              (modify/add-game game-id (scraper/get-game-title url) url)
              nil))
      nil)))