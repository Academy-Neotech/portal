package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srl.neotech.dao.AggiungiRisorsaDAO;
import srl.neotech.entity.*;

import javax.transaction.Transactional;

@Service
public class AggiungiRisorsaServices {
    @Autowired
    AggiungiRisorsaDAO aggiungiRisorsaDAO;

    @Transactional
    public void inserisciRisorsa(String risorsa_id, String risorsa_nominativo,String url_cv){
        Risorsa risorsa=new Risorsa();
        risorsa.setId(risorsa_id);
        risorsa.setRisorsaNominativo(risorsa_nominativo);
        risorsa.setUrlCv("http://"+url_cv);

        Skill skill=new Skill();
        skill.setId(risorsa_id);

        RisorsaHasSkillId risorsaHasSkillId=new RisorsaHasSkillId();
        risorsaHasSkillId.setRisorsaId(risorsa_id);
        risorsaHasSkillId.setSkillId(skill.getId());

        RisorsaHasSkill risorsaHasSkill=new RisorsaHasSkill();
        risorsaHasSkill.setId(risorsaHasSkillId);
        risorsaHasSkill.setRisorsa(risorsa);
        risorsaHasSkill.setSkill(skill);
        risorsaHasSkill.setLivello("");

        Stato stato=new Stato();
        stato.setStatoAmbito("");
        stato.setStatoDescr("");
        stato.setId(risorsa_id);

        risorsa.setStato(stato);


        /*mancando i "OneToMany" settati con il plurale con la funzione "Set" e le new "LinkedHashSet"
         è impossibile settare la funzione "Collections.singleton"
        */
        aggiungiRisorsaDAO.inserisciRisorsa(risorsa);
    }


}
