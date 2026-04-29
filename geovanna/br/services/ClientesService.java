package com.geovanna.br.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geovanna.br.entities.Clientes;
import com.geovanna.br.repository.ClientesRepository;

import java.util.List;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    public Clientes salvar(Clientes cliente) {
        return repository.save(cliente);
    }

    public List<Clientes> listar() {
        return repository.findAll();
    }

    public List<Clientes> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }
}