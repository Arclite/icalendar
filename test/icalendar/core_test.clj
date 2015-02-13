(ns icalendar.core-test
  (:require [clojure.test :refer :all]
            [icalendar.core :refer :all]))

(deftest header-test
  (testing "calendar header"
    (is (= calendar-header "BEGIN:VCALENDAR\nVERSION:2.0\n"))))

(deftest footer-test
  (testing "calendar footer"
    (is (= calendar-footer "END:VCALENDAR"))))

(deftest prodid
  (testing "product id"
    (is (= (product-id "Test Project") "PRODID:-//Test Project//NONSGML 1.0//EN\n"))))
