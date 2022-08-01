package srl.neotech.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "tipo_deliverable")
public class TipoDeliverable {
    @Id
    @Column(name = "tipo_deliverable_id", nullable = false)
    private Integer id;

    @Column(name = "tipo_deliverable_descr", length = 45)
    private String tipoDeliverableDescr;

    @OneToMany(mappedBy = "tipoDeliverable")
    private Set<Deliverable> deliverables = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoDeliverableDescr() {
        return tipoDeliverableDescr;
    }

    public void setTipoDeliverableDescr(String tipoDeliverableDescr) {
        this.tipoDeliverableDescr = tipoDeliverableDescr;
    }

    public Set<Deliverable> getDeliverables() {
        return deliverables;
    }

    public void setDeliverables(Set<Deliverable> deliverables) {
        this.deliverables = deliverables;
    }

}