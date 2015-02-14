(ns icalendar.core-test
  (:require [clojure.test :refer :all]
            [icalendar.core :refer :all]
            [icalendar.event-test :as event]
            [clj-time.core :as t]))

(deftest test-prodid
  (testing "product id"
    (is (= (product-id "Test Project") "PRODID:-//Test Project//NONSGML 1.0//EN"))))

(deftest test-calendar
  (testing "calendar creation"
    (is (= (calendar "Test" [event/sample event/sample])
           "BEGIN:VCALENDAR\nVERSION:2.0\nPRODID:-//Test//NONSGML 1.0//EN\nBEGIN:VEVENT\nDTSTAMP:20150601T190000Z\nDTSTART:20150601T190000Z\nDTEND:20150601T210000Z\nEND:VEVENT\nBEGIN:VEVENT\nDTSTAMP:20150601T190000Z\nDTSTART:20150601T190000Z\nDTEND:20150601T210000Z\nEND:VEVENT\nEND:VCALENDAR"))))
