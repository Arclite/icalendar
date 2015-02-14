(ns icalendar.event-test
  (:require [clojure.test :refer :all]
            [icalendar.event :refer :all]
            [clj-time.core :as t]))

(def test-event 
  {:dtstamp (t/date-time 2015 6 1 19)
   :dtstart (t/date-time 2015 6 1 19)
   :dtend (t/date-time 2015 6 1 21)})

(deftest date-format-test
  (testing "formatting"
    (is (= (format-time (:dtstamp test-event)) "20150601T190000Z"))))
