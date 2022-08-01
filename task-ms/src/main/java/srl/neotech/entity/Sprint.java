package srl.neotech.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "sprint")
public class Sprint {
    @Id
    @Column(name = "sprint_id", nullable = false)
    private Integer id;

    @Column(name = "sprint_descr", length = 45)
    private String sprintDescr;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "stato_id", nullable = false)
    private Stato stato;

    @Column(name = "data_inizio")
    private LocalDate dataInizio;

    @Column(name = "data_termine_prevista")
    private LocalDate dataTerminePrevista;

    @Column(name = "data_termine")
    private LocalDate dataTermine;

    @Column(name = "competamento")
    private Integer competamento;

    @OneToMany(mappedBy = "sprintSprint")
    private Set<Deliverable> deliverables = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSprintDescr() {
        return sprintDescr;
    }

    public void setSprintDescr(String sprintDescr) {
        this.sprintDescr = sprintDescr;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
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

    public Integer getCompetamento() {
        return competamento;
    }

    public void setCompetamento(Integer competamento) {
        this.competamento = competamento;
    }

    public Set<Deliverable> getDeliverables() {
        return deliverables;
    }

    public void setDeliverables(Set<Deliverable> deliverables) {
        this.deliverables = deliverables;
    }

}