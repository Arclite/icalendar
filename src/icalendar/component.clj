(ns icalendar.component)

(defprotocol Component
  "Component that can be added to a calendar."
  (export [c] "Export component to string."))
