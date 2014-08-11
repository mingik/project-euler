(defn gener [start]
  (lazy-seq (cons (#(if (or (= (rem % 3) 0) (= (rem % 5) 0)) % 0) start)  
                  (gener (inc start)))))

(prn (reduce + (take 999 (gener 1))))