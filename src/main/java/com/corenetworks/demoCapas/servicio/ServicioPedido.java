package com.corenetworks.demoCapas.servicio;

import com.corenetworks.demoCapas.modelo.Pedido;
import com.corenetworks.demoCapas.repositorio.IRepoPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPedido implements IServicioPedido{
    @Autowired
    private IRepoPedido capaRepo;


    @Override
    public String insertar(Pedido p) {
        return capaRepo.insertar(p);
    }
}
