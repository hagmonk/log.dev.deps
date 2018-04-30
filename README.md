# Making stuartsierra/log.dev work for tools.deps

## Leiningen 

```
> lein run
18:31:11.392 INFO  test.core [main]
hi there
```

## tools.deps

Fails in the following manner:

```
> clj -m test.core
SLF4J: Class path contains multiple SLF4J bindings.
SLF4J: Found binding in [jar:file:/Users/lburton/.m2/repository/org/slf4j/slf4j-log4j12/1.6.1/slf4j-log4j12-1.6.1.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: Found binding in [jar:file:/Users/lburton/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar!/org/slf4j/impl/StaticLoggerBinder.class]
SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
SLF4J: Actual binding is of type [org.slf4j.impl.Log4jLoggerFactory]
log4j:WARN No appenders could be found for logger (test.core).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
```

If we remove the kafka_2.11 dependency, which transitively includes log4j via
zookeeper, everything starts working again:

```
> clj -m test.core
18:33:02.399 INFO  test.core [main]
hi there
```

