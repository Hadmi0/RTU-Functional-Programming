(ns PalindromeAndMaxValue)

;Max Value

(defn GetMax [& numbers]  (last (sort numbers)))

(println "Get Max value:")
(println (GetMax 1 8 3 4 0 -1 100 99 7))

(println(= (GetMax 1 8 3 4) 8 ))
(println(= (GetMax 30 20) 30 ))
(println(= (GetMax 45 67 11) 67 ))



; Palindrome

(defn palindrome [givenSequence] (= (seq givenSequence) (seq (reverse givenSequence))))

(println "Check Palindrome:")
(println (palindrome "racecar" ))
(println (palindrome "Not Palindrome" ))

(println(false? (palindrome '(1 2 3 4 5))))
(println(true? (palindrome "racecar")))
(println(true? (palindrome [:foo :bar :foo])))
(println(true? (palindrome '(1 1 3 3 1 1))))
(println(false? (palindrome '(:a :b :c))))