package srl.neotech.taskEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "task")
public class Task implements Serializable {
    private static final long serialVersionUID = 8433114095794923855L;
    private Integer id;

    private String tasDescr;

    private Cliente clienteCliente;

    private Stato stato;

    private LocalDate dataInizio;

    private LocalDate dataTerminePrevista;

    private LocalDate dataTermine;

    @Id
    @Column(name = "task_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "tas_descr", length = 45)
    public String getTasDescr() {
        return tasDescr;
    }

    public void setTasDescr(String tasDescr) {
        this.tasDescr = tasDescr;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cliente_cliente_id", nullable = false)
    public Cliente getClienteCliente() {
        return clienteCliente;
    }

    public void setClienteCliente(Cliente clienteCliente) {
        this.clienteCliente = clienteCliente;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "stato_id", nullable = false)
    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Column(name = "data_inizio")
    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    @Column(name = "data_termine_prevista")
    public LocalDate getDataTerminePrevista() {
        return dataTerminePrevista;
    }

    public void setDataTerminePrevista(LocalDate dataTerminePrevista) {
        this.dataTerminePrevista = dataTerminePrevista;
    }

    @Column(name = "data_termine")
    public LocalDate getDataTermine() {
        return dataTermine;
    }

    public void setDataTermine(LocalDate dataTermine) {
        this.dataTermine = dataTermine;
    }

}