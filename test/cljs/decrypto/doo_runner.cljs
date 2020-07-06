(ns decrypto.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [decrypto.core-test]))

(doo-tests 'decrypto.core-test)

