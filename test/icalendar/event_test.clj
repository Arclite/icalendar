(ns icalendar.event-test
  (:require [clojure.test :refer :all]
            [icalendar.event :refer :all]
            [clj-time.core :as t])
  (:import [icalendar.event Event]))

(def sample-event (Event. (t/date-time 2015 6 1 19)
                         "sample-event"
                         (t/date-time 2015 6 1 19)
                         (t/date-time 2015 6 1 21)))

(def sample-event-two (Event. (t/date-time 2015 6 2 21)
                            "sample-event-two"
                            (t/date-time 2015 6 2 21)
                            (t/date-time 2015 6 2 22)))

(deftest date-format-test
  (testing "formatting"
    (is (= (format-time (.dtstamp sample-event)) "20150601T190000Z"))))
