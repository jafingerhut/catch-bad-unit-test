(defproject catchme "0.1.0-SNAPSHOT"
  :description "Try catching incorrectly Clojure unit tests using various mechanisms"
  :url "http://github.com/jafingerhut/catch-bad-unit-test"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0-alpha7"]]
  :profiles {:dev {:plugins [[jonase/eastwood "0.2.8"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :1.10a6 {:dependencies [[org.clojure/clojure "1.10.0-alpha6"]]}
             :1.10a7 {:dependencies [[org.clojure/clojure "1.10.0-alpha7"]]}}
  :aliases {"test-all" ["with-profile" "test,1.9,dev:test,1.10a6,dev:test,1.10a7,dev" "test"]})
