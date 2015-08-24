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
 
 
(def h2
  {:classname   "org.h2.Driver"
   :subprotocol "h2"
   :subname     "./resources/database"})
 
(open-global-when-necessary h2)
