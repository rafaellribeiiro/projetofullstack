package com.rafaelribeiro.projetofullstack.services;

import com.rafaelribeiro.projetofullstack.entities.Cliente;
import com.rafaelribeiro.projetofullstack.exceptions.ObjectNotFoundException;
import com.rafaelribeiro.projetofullstack.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public Cliente buscar(Integer id){
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
