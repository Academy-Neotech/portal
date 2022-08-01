package srl.neotech.model;

public class Stato {

    private String id;
    private String stato_descr;

    public Stato(String id,String stato_descr){
        this.id=id;
        this.stato_descr=stato_descr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStato_descr() {
        return stato_descr;
    }

    public void setStato_descr(String stato_descr) {
        this.stato_descr = stato_descr;
    }
}
