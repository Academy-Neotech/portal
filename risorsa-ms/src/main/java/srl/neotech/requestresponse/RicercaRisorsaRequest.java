package srl.neotech.requestresponse;

public class RicercaRisorsaRequest {

    private String risorsa_nominativo;
    private String skill_id;
    private String cliente_id;
    private String stato;

    public String getRisorsa_nominativo() {
        return risorsa_nominativo;
    }

    public void setRisorsa_nominativo(String risorsa_nominativo) {
        this.risorsa_nominativo = risorsa_nominativo;
    }

    public String getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(String skill_id) {
        this.skill_id = skill_id;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}
