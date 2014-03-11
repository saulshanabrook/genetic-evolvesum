(defproject genetic-evolvesum "0.1.0-SNAPSHOT"
  :description "Demonstration GA project to evolve a list with a certain sum"
  :url "https://github.com/saulshanabrook/genetic-evolvesum"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [genetic "0.1.0"]]
  :main ^:skip-aot genetic.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
