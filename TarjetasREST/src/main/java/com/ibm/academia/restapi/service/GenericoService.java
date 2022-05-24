package com.ibm.academia.restapi.service;

import java.util.Optional;

public interface GenericoService<E> {

	public Optional<E> buscarPorId(Integer id);

	public Iterable<E> buscarTodos();

	public void eliminarPorId(Integer id);
}
