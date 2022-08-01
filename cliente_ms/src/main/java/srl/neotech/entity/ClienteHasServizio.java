package srl.neotech.entity;

import javax.persistence.*;

@Entity
@Table(name = "cliente_has_servizio")
public class ClienteHasServizio {
    @EmbeddedId
    private ClienteHasServizioId id;

    @MapsId("clienteId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @MapsId("servizioId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "servizio_id", nullable = false)
    private Servizio servizio;

    @Column(name = "livello_qualita")
    private Integer livelloQualita;

    public ClienteHasServizioId getId() {
        return id;
    }

    public void setId(ClienteHasServizioId id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servizio getServizio() {
        return servizio;
    }

    public void setServizio(Servizio servizio) {
        this.servizio = servizio;
    }

    public Integer getLivelloQualita() {
        return livelloQualita;
    }

    public void setLivelloQualita(Integer livelloQualita) {
        this.livelloQualita = livelloQualita;
    }

}