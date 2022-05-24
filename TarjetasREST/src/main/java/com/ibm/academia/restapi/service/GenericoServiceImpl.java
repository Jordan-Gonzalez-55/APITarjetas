package com.ibm.academia.restapi.service;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public class GenericoServiceImpl<E, R extends CrudRepository<E, Integer>> implements GenericoService<E> {

	protected final R repository;

	public GenericoServiceImpl(R repository) {
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> buscarPorId(Integer id) {
		return repository.findById(id);
	}


	@Override
	@Transactional(readOnly = true)
	public Iterable<E> buscarTodos() {
		return repository.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Integer id) {
		repository.deleteById(id);

	}
}
