package com.ibm.academia.restapi.service;

import java.util.List;

import com.ibm.academia.restapi.modelos.entidades.Tarjeta;

public interface TarjetaService extends GenericoService<Tarjeta>{

	public List<Tarjeta> buscarMejorTarjeta(String pasion, Double salario, Integer edad);
}
