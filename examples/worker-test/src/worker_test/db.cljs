(ns worker-test.db
  (:require [cljs.spec :as s]))

;; spec of app-db
(s/def ::greeting string?)
(s/def ::primes string?)
(s/def ::app-db
  (s/keys :req-un [::greeting]))

;; initial state of app-db
(def app-db {:greeting "Hello Clojure in iOS and Android!"})
