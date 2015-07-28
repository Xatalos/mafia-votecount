(ns mafia-votecount.models
  (:require [clojure.string :as string])
  (:use [korma.db]
        [korma.core]))

(def db
(let [db-uri (java.net.URI. (System/getenv "DATABASE_URL"))]
        (->> (string/split (.getUserInfo db-uri) #":")
          (#(identity {:db (last (string/split (System/getenv "DATABASE_URL") #"\/"))
                       :classname "org.postgresql.Driver"
                       :subprotocol "postgresql"
                       :user (% 0)
                       :password (% 1)
                       :subname "//ec2-107-20-222-114.compute-1.amazonaws.com:5432/dbsa7cb9rv7jtk"})))))

(defdb korma-db db)

(declare game host player vote)

(defentity game
  (table :game)
  (has-many player)
  (has-many host)
  (has-many vote))

(defentity host
  (table :host)
  (belongs-to game))

(defentity player
  (table :player)
  (belongs-to game))

(defentity vote
  (table :vote)
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

(defn update-game [id last-index cycle-number cycle-type]
  (update game
          (set-fields {:last_index last-index
                       :cycle_number cycle-number
                       :cycle_type cycle-type})
          (where {:id id})))

(defn get-games []
  (select game))

(defn get-game-by-id [id]
  (let [games (select game (where {:id id}))]
    (if (seq? games)
      (first games)
      nil)))

(defn get-game-url [id]
  (:url (first
         (select game
                 (fields :url)
                 (where {:id id})))))

(defn add-players [game-id names]
  (let [rows (map (fn [name] {:game game-id :name name}) names)]
   (insert player
        (values rows))))

(defn get-players [game-id]
  (select player
          (fields :id :name)
          (where {:game game-id})))

(defn delete-game-by-id [id]
  (delete game
  (where {:id (string id)})))

(defn delete-player-by-id [id]
  (delete player
  (where {:id (Integer/parseInt id)})))

(defn- host-make-row [game-id name]
  {:game game-id :name name})

(defn add-hosts [game-id names]
  (insert host
          (values
           (map (partial host-make-row game-id) names))))

(defn get-hosts [game-id]
  (into #{}
        (map :name
             (select host
                     (fields :name)
                     (where {:game game-id})))))

(defn add-votes [votes]
  (if-not (empty? votes)
    (insert vote
            (values votes))))

(defn get-votes [id]
  (select vote
          (fields :id :index :day :voter :target)
          (where {:game id})
          (order :id :ASC)))
