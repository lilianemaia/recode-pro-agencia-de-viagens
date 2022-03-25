package com.dendeagencia.dendeturismoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dendeagencia.dendeturismoapi.entities.Destino;


@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {

}