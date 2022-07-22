package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "sprint")
public class Sprint implements Serializable {
    private static final long serialVersionUID = 5703641632414639850L;
    private Integer id;

    private String sprintDescr;

    private Task task;

    private Stato stato;

    private LocalDate dataInizio;

    private LocalDate dataTerminePrevista;

    private LocalDate dataTermine;

    private Integer competamento;

    @Id
    @Column(name = "sprint_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "sprint_descr", length = 45)
    public String getSprintDescr() {
        return sprintDescr;
    }

    public void setSprintDescr(String sprintDescr) {
        this.sprintDescr = sprintDescr;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "task_id", nullable = false)
    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
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

    @Column(name = "competamento")
    public Integer getCompetamento() {
        return competamento;
    }

    public void setCompetamento(Integer competamento) {
        this.competamento = competamento;
    }

}