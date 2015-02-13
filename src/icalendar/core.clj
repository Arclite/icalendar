(ns icalendar.core)

(defn product-id [name]
  (str "PRODID:-//" name "//NONSGML 1.0//EN\n"))

(def calendar-header
  (str "BEGIN:VCALENDAR\nVERSION:2.0\n"))

(def calendar-footer
  (str "END:VCALENDAR"))

(defn calendar [name]
  (str calendar-header (product-id name) calendar-footer))

