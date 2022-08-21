package com.rafaelribeiro.projetofullstack.services;

import com.rafaelribeiro.projetofullstack.entities.Categoria;
import com.rafaelribeiro.projetofullstack.exceptions.ObjectNotFoundException;
import com.rafaelribeiro.projetofullstack.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria buscar(Integer id){
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}
