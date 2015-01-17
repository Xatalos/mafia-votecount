(ns lobos.config
  (:use lobos.connectivity))

(def h2
  {:classname   "org.h2.Driver"
   :subprotocol "h2"
   :subname     "./resources/database"})

(open-global h2)