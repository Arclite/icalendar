(ns icalendar.event-test
  (:require [clojure.test :refer :all]
            [icalendar.event :refer :all]
            [clj-time.core :as t]))

(def test-event 
  {:timestamp (t/date-time 2015 6 1 19)
   :start (t/date-time 2015 6 1 19)
   :end (t/date-time 2015 6 1 21)})

(deftest date-format-test
  (testing "formatting"
    (is (= (format-time (:timestamp test-event)) "20150601T190000Z"))))
