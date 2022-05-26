 package com.ibm.academia.restapi.solicitud.clientes;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ibm.academia.restapi.solicitud.modelos.entidades.Solicitante;

@FeignClient(name = "api-tarjetas")
public interface SolicitanteClienteRest {
	
	@GetMapping("/api/vi/rest-tarjetas/tarjetas")
	public List<Solicitante> tarjetasSolicitante();
	
	@GetMapping("/api/vi/rest-tarjetas/tarjetas/mejorOferta/{pasion}/{salario}/{edad}")
	public List<Solicitante> mejoresTarjetasSolicitante(@PathVariable String pasion,@PathVariable Double salario, @PathVariable Integer edad);
}
