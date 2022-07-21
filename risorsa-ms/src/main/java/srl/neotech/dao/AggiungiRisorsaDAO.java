package srl.neotech.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import srl.neotech.entity.Risorsa;
import srl.neotech.repository.RisorsaJPARepository;

@Component
public class AggiungiRisorsaDAO {
    @Autowired
    RisorsaJPARepository risorsaJPARepository;

    public Risorsa inserisciRisorsa(Risorsa risorsa){
        return risorsaJPARepository.saveAndFlush(risorsa);
    }
}
