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