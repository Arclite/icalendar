(ns icalendar.event
  (:require [clj-time.core :as t]
            [clj-time.format :as tf]))

(def time-formatter
  (tf/formatters :basic-date-time-no-ms))

(defn format-time [t]
  (tf/unparse time-formatter t))

(defn event-string [e]
  (str "BEGIN:VEVENT\n"
       "DTSTAMP:" (format-time (:timestamp e)) "\n"
       "DTSTART:" (format-time (:start e)) "\n"
       "DTEND:" (format-time (:end e)) "\n"
       "END:VEVENT"))
