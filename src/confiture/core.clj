(ns confiture.core
  (:require
    [environ.core :refer [env]]
    [verschlimmbesserung.core :as v])
  (:import (java.net ConnectException)))

(def ETCD  "http://localhost:4001")
(def conn (v/connect ETCD))
(defn etcd-val [key] 
  (try (v/get conn key)
       (catch ConnectException _ nil)))

(def sources
  "list of property sources" 
  (atom [env etcd-val]))

(defn value [key]
  "Look up the value in all defined  sources"
  (first (filter #(not (nil? %)) (map #(% key) @sources)))
  )





