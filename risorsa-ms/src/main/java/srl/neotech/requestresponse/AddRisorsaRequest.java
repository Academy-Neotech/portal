package srl.neotech.requestresponse;

public class AddRisorsaRequest {


    private String risorsa_id;
    private String risorsa_nominativo;
    private String risorsa_cv;

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

    public String getRisorsa_cv() {
        return risorsa_cv;
    }

    public void setRisorsa_cv(String risorsa_cv) {
        this.risorsa_cv = risorsa_cv;
    }
}
