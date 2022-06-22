package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import srl.neotech.model.Risorsa;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.RicercaRisorsaServices;

import java.util.List;

@RestController
public class RicercaAPIController {
    @Autowired
    RicercaRisorsaServices ricercaRisorsaServices;

    @ResponseBody
    @GetMapping(value = "/api/getRisorsaPerId", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseBase getRisorsaPerId(@RequestParam("risorsa_id") Integer id) {
        ResponseBase responseBase = new ResponseBase();


        try {
            List<Risorsa> risorsaList = ricercaRisorsaServices.getRisorsaPerId(id);
            responseBase.setSimpleData(risorsaList);
            responseBase.setCode("OK");
        } catch (Exception e) {
            responseBase.setCode("KO");
            responseBase.setDescr(e.getMessage());
        }
        return responseBase;
    }


}
