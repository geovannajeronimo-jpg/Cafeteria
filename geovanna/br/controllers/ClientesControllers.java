package com.geovanna.br.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.*;

import com.geovanna.br.entities.Clientes;
import com.geovanna.br.services.ClientesService;

import jakarta.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/clientes")
public class ClientesControllers {

	   @Autowired
	    private ClientesService service;
	   
 

@GetMapping("/home")
public String paginaInicial() {
	return "index";
}

	    @PostMapping
	    public Clientes criar(@RequestBody @Valid Clientes cliente) {
	        return service.salvar(cliente);
	    }

	    @GetMapping
	    public List<Clientes> listar() {
	        return service.listar();
	    }

	    @GetMapping("/buscar")
	    public List<Clientes> buscar(@RequestParam String nome) {
	        return service.buscarPorNome(nome);
	    }
	}