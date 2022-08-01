package srl.neotech.model;

import java.time.LocalDate;

public class Risorsa {

    protected String risorsa_id;
    protected String risorsa_nominativo;
    protected String stato_id;
    protected Integer cliente_id;
    protected LocalDate termine_occupazione;
    protected String url_cv;
    protected String skill;

    public Risorsa(){

    }


    public Risorsa(String risorsa_id, String risorsa_nominativo, String url_cv,Integer cliente_id) {
        this.risorsa_id=risorsa_id;
        this.risorsa_nominativo=risorsa_nominativo;
        this.url_cv=url_cv;
        this.cliente_id=cliente_id;
    }




    public String getRisorsa_id() {
        return risorsa_id;
    }

    public void setRisorsa_id(String risorsa_id) {
        this.risorsa_id = risorsa_id;
    }

    public String getRisorsa_nominativo() {
        return risorsa_nominativo;
    }

    public void setRisorsa_nominativo(String risorsa_nominativo) {
        this.risorsa_nominativo = risorsa_nominativo;
    }

    public String getStato_id() {
        return stato_id;
    }

    public void setStato_id(String stato_id) {
        this.stato_id = stato_id;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public LocalDate getTermine_occupazione() {
        return termine_occupazione;
    }

    public void setTermine_occupazione(LocalDate termine_occupazione) {
        this.termine_occupazione = termine_occupazione;
    }

    public String getUrl_cv() {
        return url_cv;
    }

    public void setUrl_cv(String url_cv) {
        this.url_cv = url_cv;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

