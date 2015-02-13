(ns icalendar.core
  (:require [icalendar.event :as event]))

(defn events->string [events]
  (clojure.string/join "\n" (map event/to-string events)))

(defn product-id [name]
  (str "PRODID:-//" name "//NONSGML 1.0//EN"))

(defn calendar [name events]
  (str "BEGIN:VCALENDAR\n"
       "VERSION:2.0\n"
       (product-id name) "\n"
       (events->string events) "\n"
       "END:VCALENDAR"))

