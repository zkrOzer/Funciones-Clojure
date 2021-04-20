(ns plf02.core)

;;--------------_------PREDICADOS-----------------------------------;;
(defn función-associative?-1
  [a]
  (associative? a))
(defn función-associative?-2
  [a]
  (associative? a))
(defn función-associative?-3
  [a]
  (associative? a))

(función-associative?-1 [1 2 3])
(función-associative?-2 {:a 1 :b 2})
(función-associative?-3 #{:a :b :c})

(defn función-boolean?-1
  [a]
  (boolean? a))
(defn función-boolean?-2
  [a]
  (boolean? a))
(defn función-boolean?-3
  [a]
  (boolean? a))

(función-boolean?-1 true)
(función-boolean?-2 false)
(función-boolean?-3 "Hola")

(defn función-char?-1
  [a]
  (char? a))
(defn función-char?-2
  [a]
  (char? a))
(defn función-char?-3
  [a]
  (char? a))

(función-char?-1 \a)
(función-char?-2 2)
(función-char?-3 (first "hola"))

(defn función-coll?-1
  [a]
  (coll? a))
(defn función-coll?-2
  [a]
  (coll? a))
(defn función-coll?-3
  [a]
  (coll? a))

(función-coll?-1 45)
(función-coll?-2 [12 65 89])
(función-coll?-3 '("ESTO ES UNA LISTA"))

(defn función-decimal?-1
  [a]
  (decimal? a))
(defn función-decimal?-2
  [a]
  (decimal? a))
(defn función-decimal?-3
  [a]
  (decimal? a))

(función-decimal?-1 45)
(función-decimal?-2 99999999999999999999999999)
(función-decimal?-3 1.5)

(defn función-double?-1
  [a]
  (double? a))
(defn función-double?-2
  [a]
  (double? a))
(defn función-double?-3
  [a]
  (double? a))

(función-double?-1 1)
(función-double?-2 45.8)
(función-double?-3 1/5)

(defn función-float?-1
  [a]
  (float? a))
(defn función-float?-2
  [a]
  (float? a))
(defn función-float?-3
  [a]
  (float? a))

(función-float?-1 45)
(función-float?-2 12.98)
(función-float?-3 8/2)

(defn función-ident?-1
  [a]
  (ident? a))
(defn función-ident?-2
  [a]
  (ident? a))
(defn función-ident?-3
  [a]
  (ident? a))

(función-ident?-1 :holaprofe)
(función-ident?-2 'holaprofe)
(función-ident?-3 123)

(defn función-indexed?-1
  [a]
  (indexed? a))
(defn función-indexed?-2
  [a]
  (indexed? a))
(defn función-indexed?-3
  [a]
  (indexed? a))

(función-indexed?-1 [56])
(función-indexed?-2 [12 65 89])
(función-indexed?-3 #{:a 12 :b 89 :c 26})

(defn función-int?-1
  [a]
  (int? a))
(defn función-int?-2
  [a]
  (int? a))
(defn función-int?-3
  [a]
  (int? a))

(función-int?-1 85)
(función-int?-2 45.0)
(función-int?-3 4/9)

(defn función-integer?-1
  [a]
  (integer? a))
(defn función-integer?-2
  [a]
  (integer? a))
(defn función-integer?-3
  [a]
  (integer? a))

(función-integer?-1 15.0)
(función-integer?-2 32)
(función-integer?-3 1/2)

(defn función-keyword?-1
  [a]
  (keyword? a))
(defn función-keyword?-2
  [a]
  (keyword? a))
(defn función-keyword?-3
  [a]
  (keyword? a))

(función-keyword?-1 :keyword)
(función-keyword?-2 true)
(función-keyword?-3 856)

(defn función-list?-1
  [a]
  (list? a))
(defn función-list?-2
  [a]
  (list? a))
(defn función-list?-3
  [a]
  (list? a))

(función-list?-1 '(5 65 87))
(función-list?-2 [21 9 4])
(función-list?-3 {:a 12 :b 15 :c 98})

(defn función-map-entry?-1
  [a]
  (map-entry? a))
(defn función-map-entry?-2
  [a]
  (map-entry? a))
(defn función-map-entry?-3
  [a]
  (map-entry? a))

(función-map-entry?-1 (first {:nombre "Josue" :Apellido "Martinez" :edad 23}))
(función-map-entry?-2 {:a 87 :b 65})
(función-map-entry?-3 {:a "hola" :b "profe" :c "UwU"})

(defn función-map?-1
  [a]
  (map? a))
(defn función-map?-2
  [a]
  (map? a))
(defn función-map?-3
  [a]
  (map? a))

(función-map?-1 (first {:nombre "Josue" :Apellido "Martinez" :edad 23}))
(función-map?-2 {:a 87 :b 65})
(función-map?-3 {:a 12 :b 15 :c 98})

(defn función-nat-int?-1
  [a]
  (nat-int? a))
(defn función-nat-int?-2
  [a]
  (nat-int? a))
(defn función-nat-int?-3
  [a]
  (nat-int? a))

(función-nat-int?-1 58)
(función-nat-int?-2 -168)
(función-nat-int?-3 0.9999)

(defn función-number?-1
  [a]
  (number? a))
(defn función-number?-2
  [a]
  (number? a))
(defn función-number?-3
  [a]
  (number? a))

(función-number?-1 58)
(función-number?-2 :a)
(función-number?-3 "HOLA")

(defn función-pos-int?-1
  [a]
  (pos-int? a))
(defn función-pos-int?-2
  [a]
  (pos-int? a))
(defn función-pos-int?-3
  [a]
  (pos-int? a))

(función-pos-int?-1 58)
(función-pos-int?-2 -98)
(función-pos-int?-3 9/8)

(defn función-ratio?-1
  [a]
  (ratio? a))
(defn función-ratio?-2
  [a]
  (ratio? a))
(defn función-ratio?-3
  [a]
  (ratio? a))

(función-ratio?-1 58)
(función-ratio?-2 -98)
(función-ratio?-3 9/8)

(defn función-rational?-1
  [a]
  (rational? a))
(defn función-rational?-2
  [a]
  (rational? a))
(defn función-rational?-3
  [a]
  (rational? a))

(función-rational?-1 58)
(función-rational?-2 84.94)
(función-rational?-3 9/8)

(defn función-seq?-1
  [a]
  (seq? a))
(defn función-seq?-2
  [a]
  (seq? a))
(defn función-seq?-3
  [a]
  (seq? a))

(función-seq?-1 [45 46 47])
(función-seq?-2 '(12 45 78))
(función-seq?-3 {:a 12 :b 54 :c 98})

(defn función-seqable?-1
  [a]
  (seqable? a))
(defn función-seqable?-2
  [a]
  (seqable? a))
(defn función-seqable?-3
  [a]
  (seqable? a))

(función-seqable?-1 \a)
(función-seqable?-2 "hola")
(función-seqable?-3 {:a 12 :b 54 :c 98})

(defn función-sequential?-1
  [a]
  (sequential? a))
(defn función-sequential?-2
  [a]
  (sequential? a))
(defn función-sequential?-3
  [a]
  (sequential? a))

(función-sequential?-1 [87 15 98])
(función-sequential?-2 '())
(función-sequential?-3 {:a 12 :b 54 :c 98})

(defn función-set?-1
  [a]
  (set? a))
(defn función-set?-2
  [a]
  (set? a))
(defn función-set?-3
  [a]
  (set? a))

(función-set?-1 ["asd" 15 \a])
(función-set?-2 {:a 87 :b 98 :c 25})
(función-set?-3 #{12 54 98})

(defn función-some?-1
  [a]
  (some? a))
(defn función-some?-2
  [a]
  (some? a))
(defn función-some?-3
  [a]
  (some? a))

(función-some?-1 [87 15 98])
(función-some?-2 :hola)
(función-some?-3 nil)

(defn función-string?-1
  [a]
  (string? a))
(defn función-string?-2
  [a]
  (string? a))
(defn función-string?-3
  [a]
  (string? a))

(función-string?-1 [])
(función-string?-2 78)
(función-string?-3 "buenas noches")

(defn función-symbol?-1
  [a]
  (symbol? a))
(defn función-symbol?-2
  [a]
  (symbol? a))
(defn función-symbol?-3
  [a]
  (symbol? a))

(función-symbol?-1 21)
(función-symbol?-2 'symbol)
(función-symbol?-3 :keyword)

(defn función-vector?-1
  [a]
  (vector? a))
(defn función-vector?-2
  [a]
  (vector? a))
(defn función-vector?-3
  [a]
  (vector? a))

(función-vector?-1 ["hola" :vector 54 \a])
(función-vector?-2 {:a 12 :b "hola"})
(función-vector?-3 '())

;;-----------------FUNCIONES DE ORDEN SUPERIOR----------------------;;

(defn función-drop-1
  [a b]
  (drop a b))
(defn función-drop-2
  [a b]
  (drop a b))
(defn función-drop-3
  [a b]
  (drop a b))

(función-drop-1 5 [56 87 12 68 849 32 84])
(función-drop-2 2 '("hola" "prfesor" "100pls"))
(función-drop-3 5 #{\a \b \c \d \e})

(defn función-drop-last-1
  [a]
  (drop-last a))

(defn función-drop-last-2
  [a b]
  (drop-last a b))

(defn función-drop-last-3
  [a b]
  (drop-last a b))

(función-drop-last-1 {:a "HOLA" :b "hola" :c "jiji" :d "jojo" :e "jeje"})
(función-drop-last-2 8 {\a 1 \b 2 \c 3 \d 4 \e 5 \f 6})
(función-drop-last-3 0 [0 98 76 54 32 1])

(defn función-drop-while-1
  [a b]
  (drop-while a b))
(defn función-drop-while-2
  [a b]
  (drop-while a b))
(defn función-drop-while-3
  [a b]
  (drop-while a b))

(función-drop-while-1 neg? [-9 -3 -7 -8 1 2 3 4 0 1])
(función-drop-while-2 pos? '(10 20 30 -30 -20 -10))
(función-drop-while-3 string? ["jelou" "aloh" nil :abc 123 \P])

(defn función-filterv-1
  [a b]
  (filterv a b))
(defn función-filterv-2
  [a b]
  (filterv a b))
(defn función-filterv-3
  [a b]
  (filterv a b))

(función-filterv-1 int? ["no soy int" :vector 54 \a])
(función-filterv-2 string? [:a -12 :b "cadena"])
(función-filterv-3 keyword? '(:nombre :apellido :eddad))

(defn función-group-by-1
  [a b]
  (group-by a b))
(defn función-group-by-2
  [a b]
  (group-by a b))
(defn función-group-by-3
  [a b]
  (group-by a b))

(función-group-by-1 int? ["asd" :keyword 54 \a])
(función-group-by-2 vector? [:a [] -12 :b "hola"])
(función-group-by-3 keyword? '(:c :a :s))

(defn función-iterate-1
  [a b]
  (iterate a b))
(defn función-iterate-2
  [a b]
  (iterate a b))
(defn función-iterate-3
  [a b]
  (iterate a b))

(función-iterate-1 inc 5)
(función-iterate-2 vector? [:a [] -12 :b "hola"])
(función-iterate-3 keyword? '(:c :a :s))

(defn función-keep-1
  [a b]
  (keep a b))
(defn función-keep-2
  [a b]
  (keep a b))
(defn función-keep-3
  [a b]
  (keep a b))

(función-keep-1 int? ["asd" :keyword 54 \a 56 87 15])
(función-keep-2 vector? [:a [] -12 :b "hola"])
(función-keep-3 keyword? '(:c 56 :a :s "hola" "adios"))

(defn función-keep-indexed-1
  [a b]
  (keep-indexed a b))
(defn función-keep-indexed-2
  [a b]
  (keep-indexed a b))
(defn función-keep-indexed-3
  [a b]
  (keep-indexed a b))

(función-keep-indexed-1 list [-9 0 29 -7 45 3 -8])
(función-keep-indexed-2 vector "Hola Mundo")
(función-keep-indexed-3 list [:a :b :c :d :e])

(defn función-map-indexed-1
  [a b]
  (map-indexed a b))
(defn función-map-indexed-2
  [a b]
  (map-indexed a b))
(defn función-map-indexed-3
  [a b]
  (map-indexed a b))

(función-map-indexed-1 hash-map "Mi Perro es Azul")
(función-map-indexed-2 list #{-98 54 897 -56 51 -9 98 15})
(función-map-indexed-3 list [:a :b :c :d :e])

(defn función-mapcat-1
  [a b]
  (mapcat a b))
(defn función-mapcat-2
  [a b]
  (mapcat a b))
(defn función-mapcat-3
  [a b]
  (mapcat a b))

(función-mapcat-1 concat [[54 98 12 32][15 98 57 32]])
(función-mapcat-2 vector [["hola" "mundo"] #{54 98 15 32} ["jeje" "jojo"] {:a 54 :b 98}])
(función-mapcat-3 list [[:a :b :c :d :e] [45 98 15]])

(defn función-mapv-1
  [a b]
  (mapv a b))
(defn función-mapv-2
  [a b c]
  (mapv a b c))
(defn función-mapv-3
  [a b c]
  (mapv a b c))

(función-mapv-1 inc [54 98 12 32])
(función-mapv-2 concat ["hola" "mundo"] ["jeje" "jojo"])
(función-mapv-3 + [54 84 12] [45 98 15])

(defn función-merge-with-1
  [a b c]
  (merge-with a b c))
(defn función-merge-with-2
  [a b c]
  (merge-with a b c))
(defn función-merge-with-3
  [a b c]
  (merge-with a b c))

(función-merge-with-1 + {:a 1 :b 2} {:a 9 :b 98 :c 0})
(función-merge-with-2 into {"hola" ["jeje" "jojo"]}{"mundo" ["jiji" "juju"]})
(función-merge-with-3 - {:a 54 :b 84} {:a 45 :b 98 :c 15})

(defn función-not-any?-1
  [a b]
  (not-any? a b))
(defn función-not-any?-2
  [a b]
  (not-any? a b))
(defn función-not-any?-3
  [a b]
  (not-any? a b))

(función-not-any?-1 odd? '(2 4 6))
(función-not-any?-2 nil? ["jeje" "jojo"])
(función-not-any?-3 odd? [54 98 15])

(defn función-not-every?-1
  [a b]
  (not-every? a b))
(defn función-not-every?-2
  [a b]
  (not-every? a b))
(defn función-not-every?-3
  [a b]
  (not-every? a b))

(función-not-every?-1 odd? '(2 4 6))
(función-not-every?-2 nil? [])
(función-not-every?-3 odd? [54 98 15])

(defn función-partition-by-1
  [a b]
  (partition-by a b))
(defn función-partition-by-2
  [a b]
  (partition-by a b))
(defn función-partition-by-3
  [a b]
  (partition-by a b))

(función-partition-by-1 even? '(47 54 98 2 4 6))
(función-partition-by-2 nil? [65 87 nil 12])
(función-partition-by-3 odd? [54 98 15])

(defn función-reduce-kv-1
  [a b c]
  (reduce-kv a b c))
(defn función-reduce-kv-2
  [a b c]
  (reduce-kv a b c))
(defn función-reduce-kv-3
  [a b c]
  (reduce-kv a b c))

(función-reduce-kv-1 assoc {5 6 7 8} [1 2 3 4])
(función-reduce-kv-2 list {12 87} [21 98 15])
(función-reduce-kv-3 vector {12 98 54 98} [54 98 15])

(defn función-remove-1
  [a b]
  (remove a b))
(defn función-remove-2
  [a b]
  (remove a b))
(defn función-remove-3
  [a b]
  (remove a b))

(función-remove-1 pos? [1 -2 2 2 -1 3 7 0])
(función-remove-2 nil? [21 nil 98 nil 15])
(función-remove-3 {:a 42 :b 69} #{:a :b :c})

(defn función-reverse-1
  [a]
  (reverse a))
(defn función-reverse-2
  [a]
  (reverse a))
(defn función-reverse-3
  [a]
  (reverse a))

(función-reverse-1 [1 -2 2 2 -1 3 7 0])
(función-reverse-2 '(1 2 3 4 5 6 7 8 9))
(función-reverse-3 "Hola Buenas Tardes")

(defn función-some-1
  [a b]
  (some a b))
(defn función-some-2
  [a b]
  (some a b))
(defn función-some-3
  [a b]
  (some a b))

(función-some-1 even? [1 -2 2 2 -1 3 7 0])
(función-some-2 {2 "dos" 3 "tres"} [nil 3 2])
(función-some-3 true? [true true true])

(defn función-sort-by-1
  [a b]
  (sort-by a b))
(defn función-sort-by-2
  [a b]
  (sort-by a b))
(defn función-sort-by-3
  [a b]
  (sort-by a b))

(función-sort-by-1 count ["aa" "bbb" "ccc"])
(función-sort-by-2 :a [{:a 5} {:a 1} {:a 2} {:a 3} {:a 4}])
(función-sort-by-3 first [[1 4] [2 6] [6 3]])

(defn función-split-with-1
  [a b]
  (split-with a b))
(defn función-split-with-2
  [a b]
  (split-with a b))
(defn función-split-with-3
  [a b]
  (split-with a b))

(función-split-with-1 odd? [11 33 55 66 77 99])
(función-split-with-2 neg? [-4 -9 -6 4 8 9])
(función-split-with-3 nil? [nil nil [1 4] [2 6] [6 3]])

(defn función-take-1
  [a b]
  (take a b))
(defn función-take-2
  [a b]
  (take a b))
(defn función-take-3
  [a b]
  (take a b))

(función-take-1 3 [11 33 55 66 77 99])
(función-take-2 1 [-4 -9 -6 4 8 9])
(función-take-3 3 [nil nil [1 4] [2 6] [6 3]])

(defn función-take-last-1
  [a b]
  (take-last a b))
(defn función-take-last-2
  [a b]
  (take-last a b))
(defn función-take-last-3
  [a b]
  (take-last a b))

(función-take-last-1 3 [11 33 55 66 77 99])
(función-take-last-2 1 [-4 -9 -6 4 8 9])
(función-take-last-3 3 [nil nil [1 4] [2 6] [6 3]])

(defn función-take-nth-1
  [a b]
  (take-nth a b))
(defn función-take-nth-2
  [a b]
  (take-nth a b))
(defn función-take-nth-3
  [a b]
  (take-nth a b))

(función-take-nth-1 2 [11 33 55 66 77 99])
(función-take-nth-2 4 [-4 -9 -6 4 8 9])
(función-take-nth-3 5 [nil nil [1 4] [2 6] [6 3]])

(defn función-take-while-1
  [a b]
  (take-while a b))
(defn función-take-while-2
  [a b]
  (take-while a b))
(defn función-take-while-3
  [a b]
  (take-while a b))

(función-take-while-1 odd? [11 33 55 66 77 99])
(función-take-while-2 neg? [-4 -9 -6 4 8 9])
(función-take-while-3 pos? [12 54 65 -65 -5 -7 12/5])

(defn función-update-1
  [a b c]
  (update a b c))
(defn función-update-2
  [a b c]
  (update a b c))
(defn función-update-3
  [a b c]
  (update a b c))

(función-update-1 {:a 10 :b 56 :c 98} :c inc)
(función-update-2 {:name "Josue" :apellido "Martinez" :edad 23} :edad inc)
(función-update-3 [12 54 65 -65 -5 -7 12/5] 0 inc)

(defn función-update-in-1
  [a b c d e]
  (update-in a b c d e))
(defn función-update-in-2
  [a b c]
  (update-in a b c))
(defn función-update-in-3
  [a b c]
  (update-in a b c))

(función-update-in-1 {:a 3} [:a] / 4 5)
(función-update-in-2 [1 2 [1 2 3]] [2 0] inc)
(función-update-in-3 [{:name "Josue" :apellido "Martinez" :edad 23} {:name "Ysai" :apellido "Morales" :edad 23}] [1 :edad] dec)



























