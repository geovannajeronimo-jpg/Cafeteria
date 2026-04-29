package com.geovanna.br.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDateTime;

@Entity
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @Positive(message = "O valor deve ser maior que zero")
    private Double valorTotal;

    private LocalDateTime dataPedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    @NotNull(message = "Pedido deve ter um cliente")
    private Clientes clientes;

    
    public Pedidos() {
    }

 
    public Pedidos(String descricao, Double valorTotal, Clientes clientes) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.clientes = clientes;
        this.dataPedido = LocalDateTime.now();
    }
    
    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Clientes getCliente() {
        return clientes;
    }

    public void setCliente(Clientes clientes) {
        this.clientes = clientes;
    }
}