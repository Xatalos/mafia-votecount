(ns mafia-votecount.models.db
  (:use [[korma.db]]))

(def db (sqlite3 {:db "resources/database.sqlite"}))

(defdb korma-db db)

(defentity game
  (table :game)
  )
