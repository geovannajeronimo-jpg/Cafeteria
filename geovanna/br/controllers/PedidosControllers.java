package com.geovanna.br.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.geovanna.br.entities.Pedidos;
import com.geovanna.br.services.PedidosService;

@RestController
@RequestMapping("/pedidos")
public class PedidosControllers {
	
	@Autowired
	private PedidosService service;
	

    @GetMapping
    public List<Pedidos> listar() {
        return service.listar();
    }

    @GetMapping("/buscar")
    public List<Pedidos> buscar(@RequestParam String nome) {
        return service.buscarPorNomeCliente(nome);
    }
}