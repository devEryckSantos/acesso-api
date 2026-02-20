package io.dev.erycksantos.acesso_api.core.domain;

public class Morador {

    private Long id;

    private String CPF;
    private String endereco;
    private String celular;

    private Long idPessoa;

    public Morador(Long id, String CPF, String endereco, String celular, Long idPessoa) {
        this.id = id;
        this.CPF = CPF;
        this.endereco = endereco;
        this.celular = celular;
        this.idPessoa = idPessoa;
    }

    public Morador() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }
}
