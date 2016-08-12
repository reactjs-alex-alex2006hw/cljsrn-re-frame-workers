(defproject cljsrn-re-frame-workers "0.1.2"
  :description "A library supporting react-native-workers with re-frame for ClojureScript and React Native."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha10"]
                 [org.clojure/clojurescript "1.9.89"]
                 [com.cognitect/transit-cljs "0.8.237"]
                 [reagent "0.6.0-rc" :exclusions [cljsjs/react cljsjs/react-dom cljsjs/react-dom-server]]
                 [re-frame "0.7.0"]]
  :plugins [[lein-cljsbuild "1.1.3"]]
  :clean-targets ["target/"]
  :profiles {:dev {:source-paths ["src"]
                   :cljsbuild    {:builds [{:source-paths ["src"]
                                            :figwheel     true
                                            :compiler     {:output-to     "target/cljsrn-re-frame-workers.js"
                                                           :output-dir    "target/"
                                                           :optimizations :none}}]}}})