(ns mcd-tokens-faucet.events
  (:require
   [re-frame.core :as re-frame]
   [mcd-tokens-faucet.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
