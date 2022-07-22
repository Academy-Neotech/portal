package srl.neotech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import srl.neotech.model.Risorsa;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.AggiungiRisorsaServices;
import srl.neotech.services.RicercaRisorsaServices;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RisorsaAPIController {
    @Autowired
    RicercaRisorsaServices ricercaRisorsaServices;
    @Autowired
    AggiungiRisorsaServices aggiungiRisorsaServices;


    @ResponseBody
    @GetMapping(value = "/api/getRisorsaPerNominativo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseBase getRisorsaPerNominativo(@RequestParam("risorsa_nominativo") String risorsa_nominativo) {
        ResponseBase responseBase = new ResponseBase();


        try {
            List<Risorsa> risorsaList = ricercaRisorsaServices.getRisorsaPerNominativo(risorsa_nominativo);
            responseBase.setSimpleData(risorsaList);
            responseBase.setCode("OK");
        } catch (Exception e) {
            responseBase.setCode("KO");
            responseBase.setDescr(e.getMessage());
        }
        return responseBase;
    }


    @ResponseBody
    @GetMapping(value= "api/inserisciRisorsa",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseBase inserisciRisorsa(@RequestParam("risorsa_id")String risorsa_id,@RequestParam("risorsa_nominativo")String risorsa_nominativo,@RequestParam("url_cv")String url_cv){
        ResponseBase responseBase=new ResponseBase();

        try {
            aggiungiRisorsaServices.inserisciRisorsa(risorsa_id, risorsa_nominativo, url_cv);
            responseBase.setCode("OK");
        }catch(Exception e){
            responseBase.setCode("KO");
            responseBase.setDescr(e.getMessage());
        }

        return responseBase;
    }

    @ResponseBody
    @GetMapping(value = "api/autocompleteNominativo", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String>autocompleteNominativo(@RequestParam (name = "q")String testo){

        ArrayList<String>responseRisorseFromDb=new ArrayList<String>();

        List<Risorsa>autocompleteNominativo=ricercaRisorsaServices.getRisorsaPerNominativo(testo);

        for (Risorsa risorsa:autocompleteNominativo){
            responseRisorseFromDb.add(risorsa.getRisorsa_nominativo());
        }

        return responseRisorseFromDb;
    }

    }




