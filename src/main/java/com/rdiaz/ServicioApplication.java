package com.rdiaz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ncubo.gestor")
public class ServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioApplication.class, args);
	}
}
