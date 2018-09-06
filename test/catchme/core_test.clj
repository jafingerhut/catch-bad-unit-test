(ns catchme.core-test
  (:require [clojure.test :refer :all]
            [catchme.core :refer :all]))

(deftest b-test
  (println "Running deftest b-test with Clojure" (clojure-version))
  (is (= (x (func 7)))))
