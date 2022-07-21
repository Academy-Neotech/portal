package srl.neotech.model;

public class Cliente {

    private Integer cliente_id;
    private String cliente_nome;
    private String stato_id;

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getCliente_nome() {
        return cliente_nome;
    }

    public void setCliente_nome(String cliente_nome) {
        this.cliente_nome = cliente_nome;
    }

    public String getStato_id() {
        return stato_id;
    }

    public void setStato_id(String stato_id) {
        this.stato_id = stato_id;
    }
}