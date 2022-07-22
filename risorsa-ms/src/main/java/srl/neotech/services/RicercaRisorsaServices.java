package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srl.neotech.dao.RicercaRisorsaDAO;
import srl.neotech.model.Risorsa;

import java.util.List;

@Service
public class RicercaRisorsaServices {

    @Autowired
    RicercaRisorsaDAO ricercaRisorsaDAO;

    public List<Risorsa> getRisorsaPerNominativo(String risorsa_nominativo){
        return ricercaRisorsaDAO.getRisorsaPerNominativo(risorsa_nominativo);
    }



}
