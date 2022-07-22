package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "deliverable")
public class Deliverable implements Serializable {
    private static final long serialVersionUID = -2469101695741225984L;
    private Integer id;

    private String deliverableDescr;

    private Stato statoStato;

    private Sprint sprintSprint;

    private TipoDeliverable tipoDeliverable;

    @Id
    @Column(name = "deliverable_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "deliverable_descr", length = 45)
    public String getDeliverableDescr() {
        return deliverableDescr;
    }

    public void setDeliverableDescr(String deliverableDescr) {
        this.deliverableDescr = deliverableDescr;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "stato_stato_id", nullable = false)
    public Stato getStatoStato() {
        return statoStato;
    }

    public void setStatoStato(Stato statoStato) {
        this.statoStato = statoStato;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sprint_sprint_id", nullable = false)
    public Sprint getSprintSprint() {
        return sprintSprint;
    }

    public void setSprintSprint(Sprint sprintSprint) {
        this.sprintSprint = sprintSprint;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_deliverable_id", nullable = false)
    public TipoDeliverable getTipoDeliverable() {
        return tipoDeliverable;
    }

    public void setTipoDeliverable(TipoDeliverable tipoDeliverable) {
        this.tipoDeliverable = tipoDeliverable;
    }

}