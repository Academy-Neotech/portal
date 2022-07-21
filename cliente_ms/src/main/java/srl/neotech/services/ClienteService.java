
package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srl.neotech.dao.ClienteDAO;

@Service
public class ClienteService {

    @Autowired
    ClienteDAO clienteDAO;

    public template.Cliente getClientebyId(Integer Id) {
        return clienteDAO.searchClientebyId(Id);

    }

    @Transactional
    public void insertCliente(Integer cliente_id,String cliente_nome, Integer stato_id) {
        srl.neotech.entity.Cliente cliente= new srl.neotech.entity.Cliente();
        cliente.setId(cliente_id);
        cliente.setClienteName(cliente_nome);
        cliente.setStatusId(stato_id);


        clienteDAO.insertCliente(cliente);

    }


}