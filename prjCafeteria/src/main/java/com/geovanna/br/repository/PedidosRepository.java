package com.geovanna.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geovanna.br.entities.Pedidos;

import java.util.List;

public interface PedidosRepository extends JpaRepository<Pedidos, Long> {

    List<Pedidos> findByClientesNome(String nome);

}