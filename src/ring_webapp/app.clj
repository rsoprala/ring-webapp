(ns ring-webapp.app
  (:require [ring.adapter.jetty :as jetty]
            [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]))

;(with-out-str (clojure.pprint/pprint request)) like php print_r($var, true)
;(defn handler
;  [request]
;  {:status 200
;   :body (:server-name request)})

(defn homepage 
  [request]
  (str "<h1> hello world! </h1>"))
   
(defn hello
  [name]
  (str "<h1> hello " name " </h1>")) ; str function

(defroutes app-routes
  (GET "/index" request (homepage request))
  (GET "/hello/:name" [name] (hello name))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
;
;(defn printme [name] 
;  (print name))

(defonce server (ring.adapter.jetty/run-jetty #'app {:port 3000 :join? false}))