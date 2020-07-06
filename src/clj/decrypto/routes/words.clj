(ns decrypto.routes.words
  (:require
   [clojure.string :as str]
   [decrypto.middleware :as middleware]
   [ring.util.response]
   [ring.util.http-response :as response]))

(def words (str/split-lines (slurp "resources/wordlist.txt")))

(defn random-words []
  (take 4 (shuffle words)))

(defn words-routes []
  [""
   {:middleware [middleware/wrap-formats]}
   ["/words" {:get (fn [_] (response/ok (random-words)))}]])
