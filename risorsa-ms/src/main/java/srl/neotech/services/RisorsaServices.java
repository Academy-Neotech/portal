package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srl.neotech.dao.RisorsaDAO;
import srl.neotech.entity.Stato;
import srl.neotech.model.Risorsa;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class RisorsaServices {

    @Autowired
    RisorsaDAO risorsaDAO;

    public List<Risorsa> get_risorsa(String risorsa_nominativo){
        return risorsaDAO.get_risorsa(risorsa_nominativo);
    }

    public List<srl.neotech.model.Skill>get_risorsa_from_skill(String id){
        return risorsaDAO.get_risorsa_from_skill(id);
    }

    @Transactional
    public void inserisciRisorsa(String risorsa_id, String risorsa_nominativo,String url_cv){
        srl.neotech.entity.Risorsa risorsa=new srl.neotech.entity.Risorsa();
        risorsa.setId(risorsa_id);
        risorsa.setRisorsaNominativo(risorsa_nominativo);
        risorsa.setUrlCv("http://"+url_cv);
/*
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
*/
        Stato stato=new Stato();
        stato.setStatoAmbito("");
        stato.setStatoDescr("");
        stato.setId(risorsa_id);

        risorsa.setStato(stato);


        /*mancando i "OneToMany" settati con il plurale con la funzione "Set" e le new "LinkedHashSet"
         è impossibile settare la funzione "Collections.singleton"
        */
        risorsaDAO.inserisciRisorsa(risorsa);
    }


     public void elimina_risorsa(String risorsa_id){
        risorsaDAO.elimina_risorsa(risorsa_id);
     }

    public void update_risorsa(Risorsa risorsaM){
        risorsaDAO.update_risorsa(risorsaM);
}


    public List<srl.neotech.model.Stato>get_r_by_stato(){
        return risorsaDAO.get_r_by_stato();
    }


}
