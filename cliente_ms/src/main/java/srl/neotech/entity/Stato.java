package srl.neotech.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "stato")
public class Stato {
    @Id
    @Column(name = "stato_id", nullable = false, length = 9)
    private String id;

    @Column(name = "stato_ambito", length = 45)
    private String statoAmbito;

    @Column(name = "stato_descr", length = 45)
    private String statoDescr;

    @OneToMany(mappedBy = "stato")
    private Set<Task> tasks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "stato")
    private Set<Utente> utentes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "stato")
    private Set<Sprint> sprints = new LinkedHashSet<>();

    @OneToMany(mappedBy = "statoStato")
    private Set<Deliverable> deliverables = new LinkedHashSet<>();

    @OneToMany(mappedBy = "stato")
    private Set<Risorsa> risorsas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "stato")
    private Set<Cliente> clientes = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatoAmbito() {
        return statoAmbito;
    }

    public void setStatoAmbito(String statoAmbito) {
        this.statoAmbito = statoAmbito;
    }

    public String getStatoDescr() {
        return statoDescr;
    }

    public void setStatoDescr(String statoDescr) {
        this.statoDescr = statoDescr;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    public Set<Utente> getUtentes() {
        return utentes;
    }

    public void setUtentes(Set<Utente> utentes) {
        this.utentes = utentes;
    }

    public Set<Sprint> getSprints() {
        return sprints;
    }

    public void setSprints(Set<Sprint> sprints) {
        this.sprints = sprints;
    }

    public Set<Deliverable> getDeliverables() {
        return deliverables;
    }

    public void setDeliverables(Set<Deliverable> deliverables) {
        this.deliverables = deliverables;
    }

    public Set<Risorsa> getRisorsas() {
        return risorsas;
    }

    public void setRisorsas(Set<Risorsa> risorsas) {
        this.risorsas = risorsas;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

}