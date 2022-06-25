package srl.neotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "stato")
public class Stato implements Serializable {
    private static final long serialVersionUID = -5349510705120913829L;
    private String id;

    private String statoAmbito;

    private String statoDescr;

    @Id
    @Column(name = "stato_id", nullable = false, length = 9)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "stato_ambito", length = 45)
    public String getStatoAmbito() {
        return statoAmbito;
    }

    public void setStatoAmbito(String statoAmbito) {
        this.statoAmbito = statoAmbito;
    }

    @Column(name = "stato_descr", length = 45)
    public String getStatoDescr() {
        return statoDescr;
    }

    public void setStatoDescr(String statoDescr) {
        this.statoDescr = statoDescr;
    }

}