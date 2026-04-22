package com.geovanna.br.DTO;

public class ClienteResponseDto {

    private Long id;
    private String nome;
    private String email;

    public ClienteResponseDto() {}

    public ClienteResponseDto(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

  
    public static ClienteResponseDto fromEntity(ClienteResponseDto cliente) {
        return new ClienteResponseDto(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail()
        );
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}