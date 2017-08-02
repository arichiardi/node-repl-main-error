(require '[cljs.build.api :as api]
         '[cljs.repl :as repl]
         '[cljs.repl.node :as node])

(api/build "src" {:output-to "out/node-repl-main-error/index.js"
                  :language-in :ecmascript5
                  :node-modules true
                  :repl-verbose true
                  :verbose true})

(repl/repl (node/repl-env)
           :watch "src")
