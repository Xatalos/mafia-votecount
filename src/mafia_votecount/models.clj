(ns mafia-votecount.models
  (:use [clojure.pprint] 
    [korma.db]
        [korma.core]))

(def db (h2 {:db "./resources/database"}))

(defdb korma-db db)

(declare game player)

(defentity game
  (table :game)
  (has-many player))

(defentity player
  (table :player)
  (belongs-to game))

(defn has-game [id]
  (not-empty 
    (select game
            (fields :id)
            (where {:id id}))))

(defn add-game [id name url] 
  (insert game
          (values {:id id
                   :name name
                   :url (str url)
                   :start_date nil})))

(defn get-games []
  (select game))

(defn get-game-by-id [id]
  (let [games (select game (where {:id id}))]
    (if (seq? games)
      (first games)
      nil)))

(defn add-players [game-id names]
  (let [rows (map (fn [name] {:game game-id :name name}) names)]
   (insert player    
        (values rows))))

(defn get-players [game-id]
  (select player
          (fields :id :name)
          (where {:game game-id})))