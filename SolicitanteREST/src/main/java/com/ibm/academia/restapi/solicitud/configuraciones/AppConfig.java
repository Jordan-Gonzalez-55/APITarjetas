package com.ibm.academia.restapi.solicitud.configuraciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean("tarjetasRest")
	public RestTemplate obtenerRestTemplate() {
		return  new RestTemplate();
	}
}
