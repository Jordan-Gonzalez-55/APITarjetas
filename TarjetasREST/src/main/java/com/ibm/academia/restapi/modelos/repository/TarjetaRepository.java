package com.ibm.academia.restapi.modelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.modelos.entidades.Tarjeta;

@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Integer>{

}
