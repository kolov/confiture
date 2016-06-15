(ns confiture.core
  (:require 
     [environ.core :refer [env]]
     [verschlimmbesserung.core :as v]))

(def ETCD  "http://localhost:4001")
(def conn (v/connect ETCD))
(defn etcd-val [key] 
  (try  (v/get conn key) 
        (catch java.net.ConnectException _ nil)))

(def sources
  "list of property sources" 
  (atom [env etcd-val]))

(defn value [key]
  "Look up the value in all defined  sources"
  (first (filter #(not (nil? %)) (map #(% key) @sources)))
  )





