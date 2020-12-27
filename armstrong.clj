(defn- digits [n]
    (map #(- (int %) (int \0))
       (str n)))

(defn- spec-pow [num len]
  (int (Math/pow num len)))

(defn is-armstrong? [num]
  (let [len (count (str num))
        d (digits num)]
    (= num (reduce + (map #(spec-pow % len) d)))))

(is-armstrong? 153)
