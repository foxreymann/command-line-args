(ns command-line-args.core)

(defn parse-args [args]
  (apply hash-map args))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
