package srl.neotech.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import srl.neotech.mapper.DozerMapper;
import srl.neotech.model.Risorsa;
import srl.neotech.model.Skill;
import srl.neotech.model.Stato;
import srl.neotech.repository.RisorsaJPARepository;
import srl.neotech.repository.StatoRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class RisorsaDAO {

    @Autowired
    RisorsaJPARepository risorsaJPARepository;
    @Autowired
    StatoRepository statoRepository;

    public List<Risorsa> get_risorsa(String risorsa_nominativo){
        List<srl.neotech.entity.Risorsa>risorse=risorsaJPARepository.get_risorsa(risorsa_nominativo);


        List<srl.neotech.model.Risorsa>listaRisorse= new ArrayList<>();

        for (srl.neotech.entity.Risorsa risorsa:risorse){
            srl.neotech.model.Risorsa risorsaMappata= DozerMapper.getInstance().map(risorsa , srl.neotech.model.Risorsa.class);
            listaRisorse.add(risorsaMappata);

        }
        return listaRisorse;
    }

    public List<Skill>get_risorsa_from_skill(String skillId){
        List<srl.neotech.entity.Risorsa>skill_risorse=risorsaJPARepository.get_risorsa_from_skill(skillId);

        List<Skill>list=new ArrayList<>();

        for (srl.neotech.entity.Risorsa skill : skill_risorse){
            Skill map=DozerMapper.getInstance().map(skill,Skill.class);
            list.add(map);
        }

        return list;
    }


    public void inserisciRisorsa(srl.neotech.entity.Risorsa risorsa){
        risorsaJPARepository.saveAndFlush(risorsa);
    }

    public void elimina_risorsa(String id){
        risorsaJPARepository.deleteById(id);
    }

    public void update_risorsa(srl.neotech.model.Risorsa risorsaM){
      //srl.neotech.entity.Risorsa entity=risorsaJPARepository.findById(risorsa.getRisorsa_id());
        //srl.neotech.entity.Risorsa r=risorsaJPARepository.findOne(risorsa.getRisorsa_id());

       srl.neotech.entity.Risorsa ent=risorsaJPARepository.findById(risorsaM.getRisorsa_id()).orElseThrow(null);

        ent.getCliente().setId(risorsaM.getCliente_id());
        ent.getStato().setId(risorsaM.getStato_id());
        ent.setUrlCv(risorsaM.getUrl_cv());
        ent.setTermineOccupazione(risorsaM.getTermine_occupazione());


/*

      entity.isPresent() ? entity.get().getCliente().setId(risorsa.getCliente_id()): ;
      entity.get().setRisorsaNominativo(risorsa.getRisorsa_nominativo());
      entity.get().setUrlCv(risorsa.getUrl_cv());
      entity.get().setTermineOccupazione(risorsa.getTermine_occupazione());


       entity.getCliente().setId(risorsa.getCliente_id());
       entity.setRisorsaNominativo(risorsa.getRisorsa_nominativo());
       entity.setUrlCv(risorsa.getUrl_cv());
       entity.setTermineOccupazione(risorsa.getTermine_occupazione());
*/
        risorsaJPARepository.saveAndFlush(ent);
       }




    public List<Stato>get_r_by_stato(){
        return statoRepository.get_r_by_stato();
      }

}
