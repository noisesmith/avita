(ns avita.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [net.cgrand.enlive-html :as html]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] (html/emit* (html/html [:h1 "hello"])))
  (GET "/submit" [] "Foo")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
