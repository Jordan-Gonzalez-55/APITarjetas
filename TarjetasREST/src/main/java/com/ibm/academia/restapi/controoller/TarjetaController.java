package com.ibm.academia.restapi.controoller;

import java.util.*;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import com.ibm.academia.restapi.excepciones.NotFoundException;
import com.ibm.academia.restapi.validaciones.TarjetaValidacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ibm.academia.restapi.modelos.entidades.Tarjeta;
import com.ibm.academia.restapi.service.TarjetaService;

@RestController
@RequestMapping("tarjetas")
public class TarjetaController {

	@Autowired
	private TarjetaService tarjetaService;

	@Autowired
	private TarjetaValidacion tarjetaValidacion;

	@Autowired
	private Environment environment;

	@GetMapping
	public ResponseEntity<?> obtenerTarjetas(){

		List<Tarjeta> listaTrajetas = (List<Tarjeta>) tarjetaService.buscarTodos();
		listaTrajetas
		.stream().
		map(tarjeta -> {
			tarjeta.setPuerto(Integer.parseInt(environment.getProperty("local.server.port")));
			return tarjeta;
		}).collect(Collectors.toList());

		return new ResponseEntity<List<Tarjeta>>(listaTrajetas,HttpStatus.OK);
	}

	@GetMapping("mejorOferta/{pasion}/{salario}/{edad}")
	public ResponseEntity<?> obtenerMejorOferta(@PathVariable String pasion, @PathVariable Double salario, @PathVariable Integer edad){
		return tarjetaValidacion.tarjetasValidadas(pasion, salario, edad);
	}
}
