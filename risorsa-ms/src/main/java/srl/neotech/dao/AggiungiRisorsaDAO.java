package srl.neotech.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import srl.neotech.repository.RisorsaJPARepository;

@Component
public class aggiungiRisorsaDAO {
    @Autowired
    RisorsaJPARepository risorsaJPARepository;

    public srl.neotech.entity.Risorsa inserisciRisorsa(srl.neotech.entity.Risorsa risorsa){
        return risorsaJPARepository.saveAndFlush(risorsa);
    }
}
