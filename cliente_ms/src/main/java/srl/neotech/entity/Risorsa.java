package srl.neotech.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "risorsa")
public class Risorsa {
    @Id
    @Column(name = "risorsa_id", nullable = false, length = 9)
    private String id;

    @Column(name = "risorsa_nominativo", length = 45)
    private String risorsaNominativo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "stato_id", nullable = false)
    private Stato stato;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "termine_occupazione")
    private LocalDate termineOccupazione;

    @Column(name = "url_cv", length = 200)
    private String urlCv;

    @OneToMany(mappedBy = "risorsa")
    private Set<RisorsaHasSkill> risorsaHasSkills = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRisorsaNominativo() {
        return risorsaNominativo;
    }

    public void setRisorsaNominativo(String risorsaNominativo) {
        this.risorsaNominativo = risorsaNominativo;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getTermineOccupazione() {
        return termineOccupazione;
    }

    public void setTermineOccupazione(LocalDate termineOccupazione) {
        this.termineOccupazione = termineOccupazione;
    }

    public String getUrlCv() {
        return urlCv;
    }

    public void setUrlCv(String urlCv) {
        this.urlCv = urlCv;
    }

    public Set<RisorsaHasSkill> getRisorsaHasSkills() {
        return risorsaHasSkills;
    }

    public void setRisorsaHasSkills(Set<RisorsaHasSkill> risorsaHasSkills) {
        this.risorsaHasSkills = risorsaHasSkills;
    }

}