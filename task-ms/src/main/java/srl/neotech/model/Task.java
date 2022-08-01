package srl.neotech.model;


import srl.neotech.entity.Cliente;

import java.time.LocalDate;


public class Task {
    private Integer id;
    private String tasDescr;
    private Cliente cliente;
    private LocalDate dataInizio;
    private LocalDate dataTerminePrevista;
    private LocalDate dataTermine;

    public Task() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTasDescr() {
        return tasDescr;
    }

    public void setTasDescr(String tasDescr) {
        this.tasDescr = tasDescr;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataTerminePrevista() {
        return dataTerminePrevista;
    }

    public void setDataTerminePrevista(LocalDate dataTerminePrevista) {
        this.dataTerminePrevista = dataTerminePrevista;
    }

    public LocalDate getDataTermine() {
        return dataTermine;
    }

    public void setDataTermine(LocalDate dataTermine) {
        this.dataTermine = dataTermine;
    }





}
