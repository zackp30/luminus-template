(ns <<project-ns>>.routes.home
  (:require [<<project-ns>>.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [clojure.java.io :as io]))

(defn home-page []
  (layout/render
    "home.html"))

(defroutes home-routes
  (GET "/" [] (home-page)))
