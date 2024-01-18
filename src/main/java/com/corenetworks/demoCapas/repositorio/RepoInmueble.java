package com.corenetworks.demoCapas.repositorio;

import com.corenetworks.demoCapas.modelo.Inmueble;
import org.springframework.stereotype.Repository;

@Repository
public class RepoInmueble implements IRepoInmueble{

    @Override
    public String insertar(Inmueble i) {
        return String.format("Simulando el acceso a BBDD de %s",i.toString());
    }
}
