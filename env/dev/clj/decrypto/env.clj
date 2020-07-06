(ns decrypto.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [decrypto.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[decrypto started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[decrypto has shut down successfully]=-"))
   :middleware wrap-dev})
