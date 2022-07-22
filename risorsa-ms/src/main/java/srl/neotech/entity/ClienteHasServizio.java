package srl.neotech.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cliente_has_servizio")
public class ClienteHasServizio implements Serializable {
    private static final long serialVersionUID = 4754605768157291034L;
    private ClienteHasServizioId id;

    private Cliente cliente;

    private Servizio servizio;

    private Integer livelloQualita;

    @EmbeddedId
    public ClienteHasServizioId getId() {
        return id;
    }

    public void setId(ClienteHasServizioId id) {
        this.id = id;
    }

    @MapsId("clienteId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cliente_id", nullable = false)
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @MapsId("servizioId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "servizio_id", nullable = false)
    public Servizio getServizio() {
        return servizio;
    }

    public void setServizio(Servizio servizio) {
        this.servizio = servizio;
    }

    @Column(name = "livello_qualita")
    public Integer getLivelloQualita() {
        return livelloQualita;
    }

    public void setLivelloQualita(Integer livelloQualita) {
        this.livelloQualita = livelloQualita;
    }

}