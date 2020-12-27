(defn divisible-by? [x y]
  (zero? (mod x y)))

(defn fizzbuzz [n]
  (cond (and (divisible-by? n 3) (divisible-by? n 5)) "fizzbuzz"
        (divisible-by? n 3) "fizz"
        (divisible-by? n 5) "buzz"))

(fizzbuzz 3)
(fizzbuzz 20)
(fizzbuzz 15)
