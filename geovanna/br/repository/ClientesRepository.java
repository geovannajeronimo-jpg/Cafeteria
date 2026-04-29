package com.geovanna.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovanna.br.entities.Clientes;

import java.util.List;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

    List<Clientes> findByNomeContainingIgnoreCase(String nome);

}