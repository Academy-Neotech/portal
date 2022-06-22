package srl.neotech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Risorsa {
    @Id
    @Column(name = "risorsa_id", nullable = false, length = 1000)
    private Integer id;

    @Column(name= "risorsa_nominativo", nullable = false, length =1000)
    private String nominativo;


    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }
}
