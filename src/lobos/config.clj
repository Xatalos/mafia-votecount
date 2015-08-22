(ns lobos.config
  (:require [clojure.string :as string])
  (:use lobos.connectivity))


;; http://pupeno.com/2011/08/20/how-to-use-lobos-with-heroku/
(defn open-global-when-necessary
  "Open a global connection only when necessary, that is, when no previous
  connection exist or when db-spec is different to the current global
  connection."
  [db-spec]
  ;; If the connection credentials has changed, close the connection.
  (when (and (@lobos.connectivity/global-connections :default-connection)
             (not= (:db-spec (@lobos.connectivity/global-connections :default-connection)) db-spec))
    (lobos.connectivity/close-global))
  ;; Open a new connection or return the existing one.
  (if (nil? (@lobos.connectivity/global-connections :default-connection))
    ((lobos.connectivity/open-global db-spec) :default-connection)
    (@lobos.connectivity/global-connections :default-connection)))


(def db
(let [db-uri (java.net.URI. (System/getenv "DATABASE_URL"))]
        (->> (string/split (.getUserInfo db-uri) #":")
          (#(identity {:db (last (string/split (System/getenv "DATABASE_URL") #"\/"))
                       :classname "org.postgresql.Driver"
                       :subprotocol "postgresql"
                       :user "mkfmmlvmpvyedr"
                       :password "PA2yo5LpKTNQvnux4YdS1tODE4"
                       :subname "//ec2-54-197-253-142.compute-1.amazonaws.com:5432/dfnp55jvc64kc4"})))))

(open-global-when-necessary db)
