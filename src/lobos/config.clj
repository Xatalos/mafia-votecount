(ns lobos.config
  (:use lobos.connectivity))

(def db
  {:classname "org.sqlite.JDBC"
   :subprotocol "sqlite"
   :subname "resources/database.sqlite"
   :create true })

(open-global db)