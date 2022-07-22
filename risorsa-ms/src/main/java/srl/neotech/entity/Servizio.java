package srl.neotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "servizio")
public class Servizio implements Serializable {
    private static final long serialVersionUID = -9222818517749605488L;
    private Integer id;

    private String prodottoDescr;

    @Id
    @Column(name = "servizio_id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "prodotto_descr", length = 45)
    public String getProdottoDescr() {
        return prodottoDescr;
    }

    public void setProdottoDescr(String prodottoDescr) {
        this.prodottoDescr = prodottoDescr;
    }

}