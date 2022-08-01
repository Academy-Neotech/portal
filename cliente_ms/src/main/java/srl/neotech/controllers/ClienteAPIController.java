package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import srl.neotech.model.Cliente;
import srl.neotech.requestresponse.AddClienteReq;
import srl.neotech.requestresponse.GetClienteResp;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.ClienteService;

import java.util.List;

@RestController
public class ClienteAPIController {


        @Autowired
        ClienteService clienteService;


        @ResponseBody
        @GetMapping(value = "/api/getClientePer{Id}", produces = MediaType.APPLICATION_JSON_VALUE)
        public GetClienteResp getClientePerId(@RequestParam("id") Integer id) {
                GetClienteResp responseBase=new GetClienteResp();

               try {
                       List<Cliente> clienteList = clienteService.getClientePerId(id);
                       responseBase.setSimpleData(clienteList);
                       responseBase.setCode("OK");
               }catch (Exception e){
                       responseBase.setCode("KO");
                       responseBase.setDescr(e.getMessage()
                       );
               }

                return responseBase;
        }

        @ResponseBody
        @GetMapping(value = "api/inserisciCliente",produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseBase inserisciCliente(@RequestBody AddClienteReq d_req){
            ResponseBase base=new ResponseBase();

            try {
            clienteService.inserisciCliente(d_req.getCl_id(),d_req.getCl_name());
            base.setCode("OK");
            }catch (Exception e){
                base.setCode("KO");
                base.setDescr(e.getMessage());
            }
            return base;
        }

        @ResponseBody
        @GetMapping(value = "api/dlt_cliente{cliente_id}", produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseBase dlt_cliente(@RequestParam("cliente_id")Integer cliente_id){
            ResponseBase base=new ResponseBase();
            try {
                clienteService.dlt_cliente(cliente_id);
                base.setCode("OK");
            }catch (Exception e){
                base.setCode("KO");
                base.setDescr(e.getMessage());
            }
            return base;
        }

        @ResponseBody
        @GetMapping(value = "api/updt_cliente", produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseBase updt_cliente(@RequestBody Cliente cliente){
            ResponseBase base=new ResponseBase();
            try {
                clienteService.updt_cliente(cliente);
                base.setCode("OK");
            }catch (Exception e){
                base.setCode("KO");
                base.setDescr(e.getMessage());
            }



            return base;
        }





}