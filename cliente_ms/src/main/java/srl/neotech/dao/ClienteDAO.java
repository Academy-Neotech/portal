package srl.neotech.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import srl.neotech.mapper.DozerMapper;
import srl.neotech.model.Cliente;
import srl.neotech.repository.Cliente_interface;

@Component
public class ClienteDAO {


    @Autowired
    Cliente_interface cliente_interface;


    public srl.neotech.model.Cliente searchClienteById(Integer Id) {
        srl.neotech.entity.Cliente entity = Cliente_interface.getClienteById(Id);
        srl.neotech.model.Cliente cliente = DozerMapper.getInstance().map(entity, srl.neotech.model.Cliente.class);
        return cliente;
    }

    public Cliente insertCliente(Cliente cliente) {
        return clienteJPARepository.saveAndFlush(cliente);

    }

    }
