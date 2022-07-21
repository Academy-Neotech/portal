package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import srl.neotech.model.Cliente;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.ClienteService;

import javax.servlet.http.HttpServletResponse;

@RestController
@Validated
public class ClienteAPIController {


        @Autowired
        ClienteService clienteService;


        @ResponseBody
        @GetMapping(value = "/api/searchClienteById{Id}", produces = MediaType.APPLICATION_JSON_VALUE)
        public Cliente searchclienteById(@PathVariable("Id") Integer Id, HttpServletResponse response) {
                Cliente c = null;
                try {
                        m = clienteService.searchClienteById(Id);
                        response.getOutputStream().write(null, 0, response.getBufferSize());
                } catch (Exception e) {
                        e.printStackTrace();
                }

                return c;

        }


        @ResponseBody
        @GetMapping(value = "/api/insertCliente", produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseBase insertCliente(@RequestParam("cliente_id") Integer cliente_Id, @RequestParam("cliente_nome") String cliente_name, @RequestParam("stato_id") Integer status_Id) {
                ResponseBase base = new ResponseBase();

                try {
                        clienteService.insertCliente(cliente_id, cliente_nome, stato_id);
                        base.setCode("OK");
                } catch (Exception e) {
                        base.setCode("KO");
                        base.setDescr(e.getMessage());
                        e.printStackTrace();
                }

                return base;
        }
}