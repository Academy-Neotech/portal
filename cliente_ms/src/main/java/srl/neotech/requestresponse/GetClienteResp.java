package srl.neotech.requestresponse;

import srl.neotech.model.Cliente;

public class GetClienteResp extends ResponseBase{
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
