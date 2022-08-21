package com.rafaelribeiro.projetofullstack.repositories;

import com.rafaelribeiro.projetofullstack.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
