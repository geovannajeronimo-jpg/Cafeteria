package com.geovanna.br.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geovanna.br.entities.Clientes;
import com.geovanna.br.entities.Pedidos;
import com.geovanna.br.repository.ClientesRepository;
import com.geovanna.br.repository.PedidosRepository;

@Service
public class PedidosService {

	@Autowired
	private PedidosRepository repository ;
	
	
	  @Autowired
	    private ClientesRepository clientesRepository;

	    public Pedidos salvar(Pedidos pedido) {

	        if (pedido.getCliente() == null) {
	            throw new RuntimeException("Pedido precisa de cliente");
	        }

	        if (pedido.getValorTotal() <= 0) {
	            throw new RuntimeException("Valor deve ser maior que zero");
	        }

	      
	        Long idCliente = pedido.getCliente().getId();

	        Clientes cliente = clientesRepository.findById(idCliente)
	                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

	        pedido.setCliente(cliente);
	        pedido.setDataPedido(LocalDateTime.now());

	        return repository.save(pedido);
	    }

	    public List<Pedidos> listar() {
	        return repository.findAll();
	    }

	    public List<Pedidos> buscarPorNomeCliente(String nome) {
	        return repository.findByClientesNome(nome);
	    }
	}