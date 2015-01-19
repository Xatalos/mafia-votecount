(ns mafia-votecount.models
  (:use [korma.db]
        [korma.core]))

(def db (h2 {:db "./resources/database"}))

(defdb korma-db db)

(defentity game
  (table :game))

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