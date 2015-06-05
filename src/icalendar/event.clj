(ns icalendar.event
  (:require [clj-time.core :as t]
            [clj-time.format :as tf]
            [icalendar.component :refer :all]))
(def time-formatter
  (tf/formatters :basic-date-time-no-ms))

(defn format-time [t]
  (tf/unparse time-formatter t))

(defrecord Event [dtstamp uid dtstart dtend summary]
  Component
  (export [c]
    (str "BEGIN:VEVENT\n"
         "DTSTAMP:" (format-time dtstamp) "\n"
         "UID:" uid "\n"
         "DTSTART:" (format-time dtstart) "\n"
         "DTEND:" (format-time dtend) "\n"
         "SUMMARY:" summary "\n"
         "END:VEVENT")))

