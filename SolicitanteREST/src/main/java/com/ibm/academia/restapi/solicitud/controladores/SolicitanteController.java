package com.ibm.academia.restapi.solicitud.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.restapi.solicitud.modelos.entidades.Solicitante;
import com.ibm.academia.restapi.solicitud.servicios.SolicitanteService;

@RequestMapping("/solicitante")
@RestController
public class SolicitanteController {

	
	@Autowired
	private SolicitanteService solicitanteService;
	
	@GetMapping()
	public ResponseEntity<?> tarjetasSolicitante(){
		List<Solicitante> solicitante = solicitanteService.buscarTarjetasAprobadas();
		return new ResponseEntity<List<Solicitante>>(solicitante, HttpStatus.OK);
	}
	
	@GetMapping("/tarjetIdeal/pasion/{pasion}/salario/{salario}/edad/{edad}")
	public ResponseEntity<?> mejoresTarjetasSolicitante(@PathVariable String pasion,@PathVariable Double salario, @PathVariable Integer edad){
		Map<String, Object> respuesta = new HashMap<>();
		List<Solicitante> solicitante = new ArrayList<>();;

		try {
			solicitante = solicitanteService.tardejatIdeal(pasion, salario, edad);
		} catch (FeignException e) {
			respuesta.put("mensaje", e.getMessage()+" causa "+e.getCause());
			return new ResponseEntity<Map<String,Object>>(respuesta, HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			respuesta.put("mensaje", e.getMessage()+" causa "+e.getCause());
			new ResponseEntity<Map<String,Object>>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		System.out.println(solicitante);
		return new ResponseEntity<List<Solicitante>>(solicitante, HttpStatus.OK);
	}
}
