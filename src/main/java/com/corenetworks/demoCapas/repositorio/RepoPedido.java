package com.corenetworks.demoCapas.repositorio;

import com.corenetworks.demoCapas.modelo.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public class RepoPedido implements IRepoPedido {
    @Override
    public String insertar(Pedido p) {
        return String.format("Capa repo %s",p.toString() );
    }
}
