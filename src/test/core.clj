(ns test.core
  (:require [clojure.tools.logging :refer [info]]))

(defn -main [& args]
  (info "hi there")
  (Thread/sleep 1000))
