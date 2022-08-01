package srl.neotech.entity;

import javax.persistence.*;

@Entity
@Table(name = "deliverable")
public class Deliverable {
    @Id
    @Column(name = "deliverable_id", nullable = false)
    private Integer id;

    @Column(name = "deliverable_descr", length = 45)
    private String deliverableDescr;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "stato_stato_id", nullable = false)
    private Stato statoStato;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sprint_sprint_id", nullable = false)
    private Sprint sprintSprint;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_deliverable_id", nullable = false)
    private TipoDeliverable tipoDeliverable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeliverableDescr() {
        return deliverableDescr;
    }

    public void setDeliverableDescr(String deliverableDescr) {
        this.deliverableDescr = deliverableDescr;
    }

    public Stato getStatoStato() {
        return statoStato;
    }

    public void setStatoStato(Stato statoStato) {
        this.statoStato = statoStato;
    }

    public Sprint getSprintSprint() {
        return sprintSprint;
    }

    public void setSprintSprint(Sprint sprintSprint) {
        this.sprintSprint = sprintSprint;
    }

    public TipoDeliverable getTipoDeliverable() {
        return tipoDeliverable;
    }

    public void setTipoDeliverable(TipoDeliverable tipoDeliverable) {
        this.tipoDeliverable = tipoDeliverable;
    }

}