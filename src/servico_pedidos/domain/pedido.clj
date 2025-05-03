(ns servico_pedidos.domain.pedido)

(defrecord Pedido[id cliente-id valor status])

(defn validar-pedido [pedido]
    (and (:id pedido) (:cliente-d pedido) (:valor pedido)))

(defn criar-pedido [pedido]
    if ( validar-pedido pedido)
    (assoc pedido :statuts "criado")
    throw (ex-info "Pedido inválido" {: pedido pedido}))
    