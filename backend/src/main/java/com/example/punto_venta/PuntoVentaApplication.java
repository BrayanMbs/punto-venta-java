package com.example.punto_venta;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PuntoVentaApplication {

	public static void main(String[] args) {
		double suma;

		suma =  2.20 + 2;

		System.out.println("la suma de 2 + 2 es: "  + suma);

	}

}
