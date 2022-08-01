package srl.neotech.requestresponse;

public class AddClienteReq {

    private Integer cl_id;
    private String cl_name;
    private String stato;
    private String tsk;

    public Integer getCl_id() {
        return cl_id;
    }

    public void setCl_id(Integer cl_id) {
        this.cl_id = cl_id;
    }

    public String getCl_name() {
        return cl_name;
    }

    public void setCl_name(String cl_name) {
        this.cl_name = cl_name;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getTsk() {
        return tsk;
    }

    public void setTsk(String tsk) {
        this.tsk = tsk;
    }
}
