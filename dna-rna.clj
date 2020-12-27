(use '[clojure.string :only (join)])

(defn translate [ds]
  (join
    (map (fn [x]
        (case (str x)
          "G" "C"
          "C" "G"
          "T" "A"
          "A" "U"
          "")) ds)))

(translate "GCTA")

