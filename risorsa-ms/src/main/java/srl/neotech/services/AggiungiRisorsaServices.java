package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class aggiungiRisorsaServices {
    @Autowired
    AggiungiRisorsaDAO aggiungiRisorsaDAO;

    public void inserisciRisorsa(Integer risorsa_id, String risorsa_nominativo){
        srl.neotech.entity.Risorsa risorsa=new Risorsa();
        risorsa.setId(risorsa_id);
        risorsa.setNominativo(risorsa_nominativo);


        aggiungiRisorsaDAO.inserisciRisorsa(risorsa);
    }


}
