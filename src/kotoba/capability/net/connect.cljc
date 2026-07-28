(ns kotoba.capability.net.connect
  "Importable contract for net/connect.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:transport-connect}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :approval-required, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid nil, :capability/repository "kotoba-lang/capability-net-connect", :capability/id "net/connect", :capability/effects #{:network-write}, :capability/provider-status :contract-only})
