# ring-webapp

A Clojure library designed to ... well, that part is up to you.

## Usage

- cd to the path - workspace/clojure/ring-webapp
- lein repl
- user=> (load "ring_webapp/app")
; this will start the server by default
- user=>(in-ns 'ring-webapp.app)

; to stop the server
- ring-webapp.app=> (.stop server)
; to start the server
- ring-webapp.app=> (.start server)

; I guess when you make changes
- user=>(require 'ring-webapp.app :reload-all)

http://www.learningclojure.com/2013/01/getting-started-with-ring.html 

; Try this url 
- http://localhost:3000/hello/richie

; integrate with om 
http://zaiste.net/2014/02/web_applications_in_clojure_all_the_way_with_compojure_and_om/

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

