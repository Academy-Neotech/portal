package srl.neotech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import srl.neotech.model.Risorsa;
import srl.neotech.model.Skill;
import srl.neotech.model.Stato;
import srl.neotech.requestresponse.AddRisorsaRequest;
import srl.neotech.requestresponse.GetRisorsaFromSkillRespo;
import srl.neotech.requestresponse.GetRisorsaResponse;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.RisorsaServices;

import java.util.List;

@RestController
public class RisorsaAPIController {
    @Autowired
    RisorsaServices risorsaServices;


    @ResponseBody
    @GetMapping(value = "/api/get_risorsa", produces = MediaType.APPLICATION_JSON_VALUE)
    public GetRisorsaResponse get_risorsa(@RequestParam("risorsa_nominativo") String risorsa_nominativo) {
       GetRisorsaResponse responseBase = new GetRisorsaResponse();


        try {

            List<Risorsa> risorsaList =risorsaServices.get_risorsa(risorsa_nominativo);
            responseBase.setSimpleData(risorsaList);
            responseBase.setCode("OK");
        } catch (Exception e) {
            responseBase.setCode("KO");
            responseBase.setDescr(e.getMessage());
        }
        return responseBase;
    }



    @ResponseBody
    @GetMapping(value ="api/get_risorsa_from_skill",produces = MediaType.APPLICATION_JSON_VALUE)
    public GetRisorsaFromSkillRespo get_risorsa_from_skill(@RequestParam("id")String id){
        GetRisorsaFromSkillRespo respo=new GetRisorsaFromSkillRespo();

        try {
            List<Skill> list = risorsaServices.get_risorsa_from_skill(id);
            respo.setSimpleData(list);
            respo.setCode("OK");
        }catch (Exception e){
            respo.setCode("KO");
            respo.setDescr(e.getMessage());
        }
        return respo;
    }


    @ResponseBody
    @GetMapping(value= "api/inserisciRisorsa",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseBase inserisciRisorsa(@RequestBody AddRisorsaRequest dati_request){

        ResponseBase responseBase=new ResponseBase();
        try {
            risorsaServices.inserisciRisorsa(dati_request.getRisorsa_id(),dati_request.getRisorsa_nominativo(),dati_request.getRisorsa_cv());
            responseBase.setCode("OK");
        }catch(Exception e){
            responseBase.setCode("KO");
            responseBase.setDescr(e.getMessage());
        }

        return responseBase;
    }

    @ResponseBody
    @GetMapping(value = "/api/elimina_risorsa{risorsa_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseBase elimina_risorsa(@RequestParam("risorsa_id")String risorsa_id){
        ResponseBase responseBase=new ResponseBase();

        try {
            risorsaServices.elimina_risorsa(risorsa_id);
            responseBase.setCode("OK");
        }catch (Exception e){
            responseBase.setCode("KO");
            responseBase.setDescr(e.getMessage());
        }
        return  responseBase;
    }

    @ResponseBody
    @GetMapping(value = "/api/update_risorsa", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseBase update_risorsa(@RequestBody Risorsa risorsaM){
        ResponseBase base=new ResponseBase();

        try {
            risorsaServices.update_risorsa(risorsaM);
            base.setCode("OK");
        }catch (Exception e){
            base.setCode("KO");
            base.setDescr(e.getMessage());
        }


        return base;
    }


    @ResponseBody
    @GetMapping(value = "api/stato_t_f", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Stato>stato_t_f(){
        return risorsaServices.get_r_by_stato();


    }
    }




