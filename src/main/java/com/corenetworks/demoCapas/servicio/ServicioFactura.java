package com.corenetworks.demoCapas.servicio;

import com.corenetworks.demoCapas.modelo.Factura;
import com.corenetworks.demoCapas.repositorio.IRepoFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioFactura implements IServicioFactura{
    @Autowired
    private IRepoFactura capaRepo;
    @Override
    public String insertar(Factura f) {
        return capaRepo.insertar(f);
    }
}
