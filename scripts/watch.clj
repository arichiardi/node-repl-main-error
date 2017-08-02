(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'node-repl-main-error.core
   :output-to "out/node_repl_main_error.js"
   :output-dir "out"})
