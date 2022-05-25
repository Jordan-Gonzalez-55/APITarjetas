package com.ibm.academia.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.modelos.entidades.Tarjeta;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Integer>{

	@Query(value = "SELECT * FROM TARJETAS WHERE UPPER(PASION)=UPPER(?1) AND EDAD_MINIMA <= ?2 AND EDAD_MAXIMA>=?2 AND  SALARIO_MINIMO <= ?3 AND SALARIO_MAXIMO >= ?3 ", nativeQuery = true)
	public Iterable<Tarjeta> mejorOferta(String pasion,  Integer edad, Double salario);
	
	
}
