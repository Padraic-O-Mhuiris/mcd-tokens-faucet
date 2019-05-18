(ns mcd-tokens-faucet.views
  (:require
   [re-frame.core :as r]
   [mcd-tokens-faucet.subs :as s]
   ))

(defn main-panel []
  (let [name (r/subscribe [::s/name])]
    [:div
     [:h1 "MCD TOKENS FAUCET"]
     ]))
