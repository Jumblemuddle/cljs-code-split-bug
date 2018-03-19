(require '[cljs.build.api :as b])

(b/build "src" {:output-dir "out"
                :asset-path "/out"
                :modules {:a {:entries '#{code.split.a}
                              :output-to "out/a.js"}
                          :b {:entries '#{code.split.b}
                              :output-to "out/b.js"}
                          :c {:entries '#{code.split.c}
                              :output-to "out/c.js"}}})
