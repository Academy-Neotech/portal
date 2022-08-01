package srl.neotech.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import srl.neotech.mapper.DozerMapper;
import srl.neotech.model.Cliente;
import srl.neotech.repository.ClienteRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClienteDAO {


    @Autowired
    ClienteRepository clienteRepository;


    public List<srl.neotech.model.Cliente>getClientePerId(Integer id){
        List<srl.neotech.entity.Cliente> clienti=clienteRepository.getClientePerId(id);

        List<Cliente>listaClienti= new ArrayList<>();

        for (srl.neotech.entity.Cliente cliente:clienti){
            srl.neotech.model.Cliente mappingCliente= DozerMapper.getInstance().map(cliente , srl.neotech.model.Cliente.class);
            listaClienti.add(mappingCliente);

        }
        return listaClienti;
    }

    public void inserisciCliente(srl.neotech.entity.Cliente cliente){
        clienteRepository.saveAndFlush(cliente);
    }


    public void dlt_cliente(Integer id){

        clienteRepository.deleteById(id);
    }

    public void updt_cliente(Cliente clienteM){
        srl.neotech.entity.Cliente c_ent=clienteRepository.findById(clienteM.getCliente_id()).orElseThrow(null);

        c_ent.getStato().setId(clienteM.getStato_id());
        c_ent.setClienteNome(clienteM.getCliente_nome());
        c_ent.setId(clienteM.getCliente_id());

        clienteRepository.saveAndFlush(c_ent);

    }

    }
