package srl.neotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tipo_deliverable")
public class TipoDeliverable implements Serializable {
    private static final long serialVersionUID = 1811626899387718697L;
    private Integer id;

    private String tipoDeliverableDescr;

    @Id
    @Column(name = "tipo_deliverable_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "tipo_deliverable_descr", length = 45)
    public String getTipoDeliverableDescr() {
        return tipoDeliverableDescr;
    }

    public void setTipoDeliverableDescr(String tipoDeliverableDescr) {
        this.tipoDeliverableDescr = tipoDeliverableDescr;
    }

}