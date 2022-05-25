package com.ibm.academia.restapi.controoller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.restapi.modelos.entidades.Tarjeta;
import com.ibm.academia.restapi.service.TarjetaService;

@RestController
@RequestMapping("tarjetas")
public class TarjetaController {

	@Autowired
	private TarjetaService tarjetaService;
	
	@GetMapping
	public ResponseEntity<?> obtenerTarjetas(){
		return new ResponseEntity<List<Tarjeta>>((List<Tarjeta>) tarjetaService.buscarTodos(),HttpStatus.OK);
	}
	
	@GetMapping("mejorOferta")
	public ResponseEntity<?> obtenerMejorOferta(@RequestParam(value = "pasion") String pasion, @RequestParam(value = "salario") Double salario,@RequestParam(value = "edad") Integer edad){
		return new ResponseEntity<List<Tarjeta>>((List<Tarjeta>) tarjetaService.buscarMejorTarjeta(pasion, salario, edad),HttpStatus.OK);
	}
}
