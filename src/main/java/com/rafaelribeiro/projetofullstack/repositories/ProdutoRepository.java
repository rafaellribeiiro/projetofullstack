package com.rafaelribeiro.projetofullstack.repositories;

import com.rafaelribeiro.projetofullstack.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
