package com.corenetworks.demoCapas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inmueble {
    private String referencia;
    private String rutaFotoPequena;
    private String rutaFotoGrande;
    private String descripcion;
}
