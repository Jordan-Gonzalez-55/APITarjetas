package com.ibm.academia.restapi.service;

import java.util.List;

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
	public List<Tarjeta> buscarMejorTarjeta(String pasion, Double salario, Integer edad) {
		System.out.println(pasion);
		System.out.println(salario);
		System.out.println(edad);
		System.out.println((List<Tarjeta>) this.repository.mejorOferta(pasion,edad,salario));
		return (List<Tarjeta>) this.repository.mejorOferta(pasion,edad,salario);
	}

}
