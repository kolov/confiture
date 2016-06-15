(defproject confiture "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [environ "1.0.3"]
                 [verschlimmbesserung "0.1.2"]]

  :profiles {:dev {:dependencies [[alembic "0.3.2"]]}}
  )
