package com.rafaelribeiro.projetofullstack.repositories;

import com.rafaelribeiro.projetofullstack.entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
