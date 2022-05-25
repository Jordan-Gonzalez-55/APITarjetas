package com.ibm.academia.restapi.solicitud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SolicitanteRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolicitanteRestApplication.class, args);
	}

}
