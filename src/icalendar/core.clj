(ns icalendar.core
  (:require [icalendar.component :as c]))

(defn export [components]
  (clojure.string/join "\n" (map c/export components)))

(defn product-id [name]
  (str "PRODID:-//" name "//NONSGML 1.0//EN"))

(defn calendar [name components]
  (str "BEGIN:VCALENDAR\n"
       "VERSION:2.0\n"
       (product-id name) "\n"
       (export components) "\n"
       "END:VCALENDAR"))

