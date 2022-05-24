package com.ibm.academia.restapi.service;

import org.springframework.stereotype.Service;

import com.ibm.academia.restapi.modelos.entidades.Tarjeta;
import com.ibm.academia.restapi.repository.TarjetaRepository;

@Service
public class TarjetaServiceImpl extends GenericoServiceImpl<Tarjeta, TarjetaRepository>implements TarjetaService{

	public TarjetaServiceImpl(TarjetaRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Tarjeta buscarMejorTarjeta(String pasion, Double salario, Integer edad) {
		// TODO Auto-generated method stub
		return null;
	}

}
