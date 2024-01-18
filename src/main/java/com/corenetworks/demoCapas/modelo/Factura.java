package com.corenetworks.demoCapas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura {
    private int idFactura;
    private LocalDate fFactura;
    private double importe;

}
