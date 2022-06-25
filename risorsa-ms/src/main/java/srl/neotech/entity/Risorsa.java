package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "risorsa")
public class Risorsa implements Serializable {
    private static final long serialVersionUID = -267493616493748331L;
    private String id;

    private String risorsaNominativo;

    private Stato stato;

    private Cliente cliente;

    private LocalDate termineOccupazione;

    private String urlCv;

    @Id
    @Column(name = "risorsa_id", nullable = false, length = 9)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "risorsa_nominativo", length = 45)
    public String getRisorsaNominativo() {
        return risorsaNominativo;
    }

    public void setRisorsaNominativo(String risorsaNominativo) {
        this.risorsaNominativo = risorsaNominativo;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "stato_id", nullable = false)
    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cliente_id", nullable = false)
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Column(name = "termine_occupazione")
    public LocalDate getTermineOccupazione() {
        return termineOccupazione;
    }

    public void setTermineOccupazione(LocalDate termineOccupazione) {
        this.termineOccupazione = termineOccupazione;
    }

    @Column(name = "url_cv", length = 200)
    public String getUrlCv() {
        return urlCv;
    }

    public void setUrlCv(String urlCv) {
        this.urlCv = urlCv;
    }

}