(ns fizzbuzz-clj.core)

(defn fizzbuzz
  "Given a number, if the number is divisible by 3, returns fizz.
  If the number is divisible by 5, returns buzz.
  If the number is divisible by 3 and 5, returns fizzbuzz.
  Otherwhise, return the number."

  [x]
  
  (cond
   (zero? x) x
   (zero? (rem x 15)) "fizzbuzz"
   (zero? (rem x 5)) "buzz"
   (zero? (rem x 3)) "fizz"
   :else x))
