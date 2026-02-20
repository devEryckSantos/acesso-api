package io.dev.erycksantos.acesso_api.core.domain;

import java.time.LocalDateTime;

public class Visita {

    private Long id;
    private LocalDateTime dataHoraEntrada;

    private Long idVisitante;
    private Long idMorador;

    public Visita(Long id, LocalDateTime dataHoraEntrada, Long idVisitante, Long idMorador) {
        this.id = id;
        this.dataHoraEntrada = dataHoraEntrada;
        this.idVisitante = idVisitante;
        this.idMorador = idMorador;
    }

    public Visita() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public Long getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(Long idVisitante) {
        this.idVisitante = idVisitante;
    }

    public Long getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(Long idMorador) {
        this.idMorador = idMorador;
    }
}
