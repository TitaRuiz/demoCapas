package com.corenetworks.demoCapas;

import com.corenetworks.demoCapas.modelo.Factura;
import com.corenetworks.demoCapas.modelo.Inmueble;
import com.corenetworks.demoCapas.modelo.Pedido;
import com.corenetworks.demoCapas.servicio.IServicioFactura;
import com.corenetworks.demoCapas.servicio.IServicioInmueble;
import com.corenetworks.demoCapas.servicio.IServicioPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoCapasApplication implements CommandLineRunner {
	@Autowired
	IServicioPedido capaServicio;
	@Autowired
	Pedido p1;
	@Autowired
	IServicioFactura capaServicioFactura;
	@Autowired
	IServicioInmueble capaServicioInmueble;

	public static void main(String[] args) {
		SpringApplication.run(DemoCapasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(capaServicio.insertar(p1));
		Factura f1 = new Factura(1, LocalDate.of(2024,1,18),350);
		System.out.println(capaServicioFactura.insertar(f1));
		Inmueble i1 = new Inmueble("HR001","imagenes/casaHR001.jpg","imagenes/grande/casaHR001.jpg","hermosa vivienda");
		System.out.println(capaServicioInmueble.insertar(i1));

	}
}
