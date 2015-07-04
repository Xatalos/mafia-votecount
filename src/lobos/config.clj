(ns lobos.config
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
  {:classname "org.postgresql.Driver"
   :subprotocol "postgresql"
   :subname "postgres://nqboeyfbipdulq:79gw1OolTi2gb8LxCFz4N1A06i@ec2-107-20-222-114.compute-1.amazonaws.com:5432/dbsa7cb9rv7jtk"})

(open-global-when-necessary db)
