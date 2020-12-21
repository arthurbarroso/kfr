(require '[clojure.string :as str])


(defn response-for
  ([s]
    (let [ll (str/join (take-last 2 s))
          l (str (last s))]
      (println (str "ll -> " ll))
        (case ll
          "?!" "Calm down, I know what I'm doing!"
          (case l
            "!" "Calm down, I know what I'm doing"
            "?" "Sure."
            " " "Ehm..."
            "Oh.."))))
  ([] "Whatever"))



(response-for "chiclete?!")
(response-for "chiclete?")
(response-for " ")
(response-for "")
