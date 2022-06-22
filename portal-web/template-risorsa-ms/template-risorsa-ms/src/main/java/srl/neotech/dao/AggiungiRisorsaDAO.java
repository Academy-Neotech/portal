package srl.neotech.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class aggiungiRisorsaDAO {
    @Autowired
    RisorsaJPARepository risorsaJPARepository;

    public srl.neotech.entity.Risorsa aggiungiRisorsa(srl.neotech.entity.Risorsa risorsa){
        return risorsaJPARepository.saveAndFlush(risorsa);
    }
}
