(ns demo.chrome-bg)

(js/console.log "chrome-bg")

(js/chrome.runtime.onInstalled.addListener
  (fn []
    (js/console.log "Installed!")
    ))