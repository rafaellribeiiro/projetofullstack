package com.rafaelribeiro.projetofullstack.repositories;

import com.rafaelribeiro.projetofullstack.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
