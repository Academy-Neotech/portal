package srl.neotech.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "cliente_id", nullable = false)
    private Integer id;

    @Column(name = "cliente_nome", length = 45)
    private String clienteNome;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "stato_id", nullable = false)
    private Stato stato;

    @OneToMany(mappedBy = "cliente")
    private Set<Task> tasks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cliente")
    private Set<Utente> utentes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cliente")
    private Set<ClienteHasServizio> clienteHasServizios = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cliente")
    private Set<Risorsa> risorsas = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
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

    public Set<ClienteHasServizio> getClienteHasServizios() {
        return clienteHasServizios;
    }

    public void setClienteHasServizios(Set<ClienteHasServizio> clienteHasServizios) {
        this.clienteHasServizios = clienteHasServizios;
    }

    public Set<Risorsa> getRisorsas() {
        return risorsas;
    }

    public void setRisorsas(Set<Risorsa> risorsas) {
        this.risorsas = risorsas;
    }

}