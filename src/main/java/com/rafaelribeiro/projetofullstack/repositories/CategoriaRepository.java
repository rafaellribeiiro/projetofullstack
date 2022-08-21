package com.rafaelribeiro.projetofullstack.repositories;

import com.rafaelribeiro.projetofullstack.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
