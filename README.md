# capability-net-connect

Atomic authority package for `net/connect`.

- imports: `#{:transport-connect}`
- effects: `#{:network-write}`
- default policy: `:approval-required`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
