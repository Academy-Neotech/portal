package srl.neotech.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "servizio")
public class Servizio {
    @Id
    @Column(name = "servizio_id", nullable = false)
    private Integer id;

    @Column(name = "prodotto_descr", length = 45)
    private String prodottoDescr;

    @OneToMany(mappedBy = "servizio")
    private Set<ClienteHasServizio> clienteHasServizios = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdottoDescr() {
        return prodottoDescr;
    }

    public void setProdottoDescr(String prodottoDescr) {
        this.prodottoDescr = prodottoDescr;
    }

    public Set<ClienteHasServizio> getClienteHasServizios() {
        return clienteHasServizios;
    }

    public void setClienteHasServizios(Set<ClienteHasServizio> clienteHasServizios) {
        this.clienteHasServizios = clienteHasServizios;
    }

}