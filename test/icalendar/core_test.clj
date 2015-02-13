(ns icalendar.core-test
  (:require [clojure.test :refer :all]
            [icalendar.core :refer :all]))

(deftest prodid
  (testing "product id"
    (is (= (product-id "Test Project") "PRODID:-//Test Project//NONSGML 1.0//EN"))))
