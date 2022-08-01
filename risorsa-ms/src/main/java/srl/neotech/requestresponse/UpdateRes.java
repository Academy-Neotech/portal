package srl.neotech.requestresponse;

public class UpdateRes {

    private String cliente_id;
    private String stato_id;
    private String termine_occupazione;
    private String url_cv;

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getStato_id() {
        return stato_id;
    }

    public void setStato_id(String stato_id) {
        this.stato_id = stato_id;
    }

    public String getTermine_occupazione() {
        return termine_occupazione;
    }

    public void setTermine_occupazione(String termine_occupazione) {
        this.termine_occupazione = termine_occupazione;
    }

    public String getUrl_cv() {
        return url_cv;
    }

    public void setUrl_cv(String url_cv) {
        this.url_cv = url_cv;
    }
}
