(defproject test "1.0.0"
  :main test.core
  
  :dependencies
  [[ch.qos.logback/logback-classic "1.2.3"]
   [ch.qos.logback/logback-core "1.2.3"]
   [org.slf4j/slf4j-api "1.7.25"]
   [org.slf4j/jcl-over-slf4j "1.7.25"]
   [org.slf4j/log4j-over-slf4j "1.7.25"]
   [org.apache.logging.log4j/log4j-to-slf4j "2.11.0"]
   [org.slf4j/osgi-over-slf4j "1.7.25"]
   [org.slf4j/jul-to-slf4j "1.7.25"]
   [org.clojure/tools.logging "0.4.0"]
   [org.apache.kafka/kafka_2.11 "1.1.0"]]

  :exclusions
  [commons-logging
   log4j
   org.apache.logging.log4j/log4j
   org.slf4j/simple
   org.slf4j/slf4j-jcl
   org.slf4j/slf4j-nop
   org.slf4j/slf4j-log4j12
   org.slf4j/slf4j-log4j13])


