
package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srl.neotech.dao.ClienteDAO;
import srl.neotech.entity.Risorsa;
import srl.neotech.entity.Stato;
import srl.neotech.entity.Task;
import srl.neotech.model.Cliente;

import java.util.Collections;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteDAO clienteDAO;


    public List<Cliente>getClientePerId(Integer id){
        return  clienteDAO.getClientePerId(id);
    }


    public void inserisciCliente(Integer id, String clienteNome){
        srl.neotech.entity.Cliente cliente=new srl.neotech.entity.Cliente();

        Risorsa risorsa=new Risorsa();
        risorsa.setCliente(cliente);


        Stato statoCliente=new Stato();
        statoCliente.setStatoDescr("");
        statoCliente.setStatoAmbito("");
        statoCliente.setId("");


        Task task=new Task();
        task.setCliente(cliente);
        task.setStato(statoCliente);


        cliente.setId(id);
        cliente.setClienteNome(clienteNome);

        cliente.setStato(statoCliente);

        cliente.setRisorsas(Collections.singleton(risorsa));
        cliente.setTasks(Collections.singleton(task));

        clienteDAO.inserisciCliente(cliente);
    }


    public void dlt_cliente(Integer id){
        clienteDAO.dlt_cliente(id);
    }

    public void updt_cliente(Cliente cliente){
        clienteDAO.updt_cliente(cliente);
    }


}