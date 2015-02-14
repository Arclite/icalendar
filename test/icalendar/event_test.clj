(ns icalendar.event-test
  (:require [clojure.test :refer :all]
            [icalendar.event :refer :all]
            [clj-time.core :as t]))

(def sample {:dtstamp (t/date-time 2015 6 1 19)
             :dtstart (t/date-time 2015 6 1 19)
             :dtend (t/date-time 2015 6 1 21)
             :uid "sample-event"})

(deftest date-format-test
  (testing "formatting"
    (is (= (format-time (:dtstamp sample)) "20150601T190000Z"))))
