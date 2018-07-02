{:user {:dependencies [[expound "0.7.1"]]
		;; https://oli.me.uk/2017/10/18/taming-clojure-spec-with-expound/
  		 :repl-options {:init (do
					           (ns user)
					           (require '[clojure.spec.alpha :as s])
					           (require '[expound.alpha :as expound])
  
							   ;; If you're doing this in the user ns for your repl...
							   (alter-var-root #'s/*explain-out* (constantly expound/printer))
							  	 
							   ;; Otherwise, you can use the method from the README.
							   (set! s/*explain-out* expound/printer))}

	    :plugins      [[venantius/ultra "0.5.2"]
	                   [lein-ancient "0.6.15"]]}}
