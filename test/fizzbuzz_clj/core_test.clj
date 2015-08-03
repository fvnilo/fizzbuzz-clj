(ns fizzbuzz-clj.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-clj.core :refer :all]))

(deftest fizzbuzz-test
  (testing "numbers that will return theirselves"
    (is (= 0 (fizzbuzz 0)))
    (is (= 1 (fizzbuzz 1)))
    (is (= 2 (fizzbuzz 2))))

  (testing "numbers that will return fizz"
    (is (= "fizz" (fizzbuzz 3)))
    (is (= "fizz" (fizzbuzz 6)))
    (is (= "fizz" (fizzbuzz 9))))

  (testing "numbers that will return buzz"
    (is (= "buzz" (fizzbuzz 5)))
    (is (= "buzz" (fizzbuzz 10)))
    (is (= "buzz" (fizzbuzz 20))))

  (testing "numbers that will return fizzbuzz"
    (is (= "fizzbuzz" (fizzbuzz 15)))
    (is (= "fizzbuzz" (fizzbuzz 30)))
    (is (= "fizzbuzz" (fizzbuzz 45)))))
