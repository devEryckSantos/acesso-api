package io.dev.erycksantos.acesso_api.core.domain;

public class Pessoa {

    private Long id;
    private Long nome;

    public Pessoa(Long id, Long nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNome() {
        return nome;
    }

    public void setNome(Long nome) {
        this.nome = nome;
    }
}
