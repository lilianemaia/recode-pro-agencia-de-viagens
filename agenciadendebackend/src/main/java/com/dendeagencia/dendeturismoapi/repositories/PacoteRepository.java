package com.dendeagencia.dendeturismoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dendeagencia.dendeturismoapi.entities.Pacote;


@Repository
public interface PacoteRepository extends JpaRepository<Pacote, Long> {

} 