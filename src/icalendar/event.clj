(ns icalendar.event
  (:require [clj-time.core :as t]
            [clj-time.format :as tf]))

(def time-formatter
  (tf/formatters :basic-date-time-no-ms))

(defn format-time [t]
  (tf/unparse time-formatter t))

(defn to-string [e]
  (str "BEGIN:VEVENT\n"
       "DTSTAMP:" (format-time (:dtstamp e)) "\n"
       "UID:" (:uid e) "\n"
       "DTSTART:" (format-time (:dtstart e)) "\n"
       "DTEND:" (format-time (:dtend e)) "\n"
       "END:VEVENT"))
