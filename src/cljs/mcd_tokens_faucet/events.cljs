(ns mcd-tokens-faucet.events
  (:require
   [re-frame.core :as rf]
   [mcd-tokens-faucet.db :as db]
   ))

(rf/reg-event-db
 ::initialize-db
 (fn [_ _]
   (js/console.log db/default-db)
   db/default-db))
