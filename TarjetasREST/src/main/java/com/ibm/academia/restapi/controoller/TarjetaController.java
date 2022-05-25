package com.ibm.academia.restapi.controoller;

import java.util.*;

import javax.websocket.server.PathParam;

import com.ibm.academia.restapi.excepciones.NotFoundException;
import com.ibm.academia.restapi.validaciones.TarjetaValidacion;
import org.springframework.beans.factory.annotation.Autowired;
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

	@GetMapping
	public ResponseEntity<?> obtenerTarjetas(){
		return new ResponseEntity<List<Tarjeta>>((List<Tarjeta>) tarjetaService.buscarTodos(),HttpStatus.OK);
	}

	@GetMapping("mejorOferta/{pasion}/{salario}/{edad}")
	public ResponseEntity<?> obtenerMejorOferta(@PathVariable String pasion, @PathVariable Double salario, @PathVariable Integer edad){
		return tarjetaValidacion.tarjetasValidadas(pasion, salario, edad);
	}
}
