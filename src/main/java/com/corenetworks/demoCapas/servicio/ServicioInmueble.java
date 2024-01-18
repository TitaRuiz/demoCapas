package com.corenetworks.demoCapas.servicio;

import com.corenetworks.demoCapas.modelo.Inmueble;
import com.corenetworks.demoCapas.repositorio.IRepoInmueble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ServicioInmueble implements IServicioInmueble{
    @Autowired
    IRepoInmueble capaRepoInmueble;
    @Override
    public String insertar(Inmueble i) {
        return capaRepoInmueble.insertar(i);
    }
}
