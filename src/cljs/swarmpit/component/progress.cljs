(ns swarmpit.component.progress
  (:require [material.component :as comp]
            [rum.core :as rum]))

(enable-console-print!)

(rum/defc progress < rum/static []
  (comp/mui
    (comp/circular-progress
      {:color      "#fff"
       :size       80
       :thickness  8
       :style      {:background "rgba(0, 0, 0, .2)"
                    :position   "absolute"
                    :display    "table"
                    :textAlign  "center"
                    :top        0
                    :left       0
                    :height     "100%"
                    :width      "100%"
                    :zIndex     10000}
       :innerStyle {:display       "table-cell"
                    :verticalAlign "middle"}})))

(defn mount!
  []
  (rum/mount (progress) (.getElementById js/document "progress")))

(defn unmount!
  []
  (rum/unmount (.getElementById js/document "progress")))

