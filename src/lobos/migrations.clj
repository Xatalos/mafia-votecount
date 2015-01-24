(ns lobos.migrations
  (:refer-clojure :exclude [alter drop
                            bigint boolean char double float time])
  (:use (lobos [migration :only [defmigration]]
               core schema config)))


(defmigration add-game-table
  (up [] (create
           (table :game
                  (varchar :id :primary-key)
                  (varchar :name :not-null)
                  (varchar :url :not-null :unique)
                  (date :start_date))))
  (down [] (drop (table :game))))

(defmigration add-player-table
  (up [] (create
           (table :player
                  (integer :id :primary-key :auto-inc)
                  (varchar :game :not-null [:refer "game" :id :on-delete :cascade])
                  (varchar :name :not-null))))
  (down [] (drop (table :player))))

(defmigration add-vote-table
  (up [] (create
           (table :vote
                  (integer :id :primary-key :auto-inc)
                  (integer :voter :not-null [:refer "player" :id :on-delete :cascade])
                  (integer :target [:refer "player" :id :on-delete :cascade]))))
  (down [] (drop (table :vote))))