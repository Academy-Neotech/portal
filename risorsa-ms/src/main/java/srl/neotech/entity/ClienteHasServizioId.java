package srl.neotech.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClienteHasServizioId implements Serializable {
    private static final long serialVersionUID = -7888718196926913273L;
    @Column(name = "cliente_id", nullable = false)
    private Integer clienteId;

    @Column(name = "servizio_id", nullable = false)
    private Integer servizioId;

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getServizioId() {
        return servizioId;
    }

    public void setServizioId(Integer servizioId) {
        this.servizioId = servizioId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ClienteHasServizioId entity = (ClienteHasServizioId) o;
        return Objects.equals(this.servizioId, entity.servizioId) &&
                Objects.equals(this.clienteId, entity.clienteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servizioId, clienteId);
    }

}