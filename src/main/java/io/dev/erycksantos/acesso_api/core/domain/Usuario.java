package io.dev.erycksantos.acesso_api.core.domain;

public class Usuario {

    private Long id;

    private String email;
    private String senha;
    boolean administrador;

    private Long idPessoa;

    public Usuario(Long id, String email, String senha, boolean administrador, Long idPessoa) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
        this.idPessoa = idPessoa;
    }

    public Usuario() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
