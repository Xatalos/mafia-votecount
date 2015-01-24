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

(defn add-players [game-id names]
  
  (do (pprint names) 
    (let [rows (map (fn [name] {:game game-id :name name}) names)]
     (do (pprint rows) 
       (insert player    
            (values rows))))))