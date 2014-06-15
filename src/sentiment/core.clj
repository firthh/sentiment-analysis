(ns sentiment.core)

(defn split-at-newline
  [text]
  (clojure.string/split text #"\n"))

(defn split-row
  [text]
  (clojure.string/split text #"\t"))

(defn load-training-file
  []
  (-> (clojure.java.io/resource "train.tsv")
      slurp))

(defn load-training-data
  []
  (->> (load-training-file)
       split-at-newline
       (map split-row)))

(count (load-training-data))
