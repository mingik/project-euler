(defn lazy-fibo [a b]
  (let [c (+ a b)]
    (lazy-seq (cons b (lazy-fibo b c)))))
    
(prn (apply + (filter even? (take-while #(< % 4000000) (lazy-fibo 0 1)))))
