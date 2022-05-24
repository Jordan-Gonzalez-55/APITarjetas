package com.ibm.academia.restapi.service;

import com.ibm.academia.restapi.modelos.entidades.Tarjeta;

public interface TarjetaService extends GenericoService<Tarjeta>{

	public Tarjeta buscarMejorTarjeta(String pasion, Double salario, Integer edad);
}
