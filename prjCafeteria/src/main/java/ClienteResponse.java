public class ClienteResponse {

    private Long id;
    private String nome;
    private String email;

    public ClienteResponse() {}

    public ClienteResponse(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public static ClienteResponse fromEntity(ClienteResponse cliente) {
        return new ClienteResponse(
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