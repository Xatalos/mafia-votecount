(ns lobos.migrations
  (:refer-clojure :exclude [alter drop
                            bigint boolean char double float time])
  (:use (lobos [migration :only [defmigration]]
               core schema config)))


(defmigration add-game-table
  (up [] (create
           (table :game
                  (varchar :id 100 :primary-key)
                  (varchar :name 100 :not-null)
                  (varchar :url 2000 :not-null :unique)
                  (date :start_date))))
  (down [] (drop (table :game))))

(defmigration add-host-table
  (up [] (create
          (table :host
                 (integer :id :primary-key :auto-inc)
                 (varchar :game :not-null
                          [:refer "game" :id :on-delete :cascade])
                 (varchar :name 40 :not-null))))
  (down [] (drop (table :host))))

(defmigration add-player-table
  (up [] (create
           (table :player
                  (integer :id :primary-key :auto-inc)
                  (varchar :game :not-null [:refer "game" :id :on-delete :cascade])
                  (varchar :name 40 :not-null))))
  (down [] (drop (table :player))))

(defmigration add-vote-table
  (up [] (create
           (table :vote
                  (integer :id :primary-key :auto-inc)
                  ;; (integer :voter :not-null [:refer "player" :id :on-delete :cascade])
                  (varchar :game :not-null [:refer "game" :id :on-delete :cascade])
                  (integer :day :not-null)
                  (integer :index :not-null)
                  (varchar :voter 40 :not-null)
                  (varchar :target 40))))
  (down [] (drop (table :vote))))
