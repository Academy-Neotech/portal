package srl.neotech.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import srl.neotech.entity.Risorsa;
import srl.neotech.mapper.DozerMapper;
import srl.neotech.repository.RisorsaJPARepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class RicercaRisorsaDAO {

    @Autowired
    RisorsaJPARepository risorsaJPARepository;

    public List<srl.neotech.model.Risorsa>getRisorsaPerNominativo(String risorsa_nominativo){
        List<Risorsa>risorse=risorsaJPARepository.getRisorsaPerNominativo(risorsa_nominativo);

        List<srl.neotech.model.Risorsa>listaRisorse= new ArrayList<>();

        for (Risorsa risorsa:risorse){
            srl.neotech.model.Risorsa risorsaMappata= DozerMapper.getInstance().map(risorsa , srl.neotech.model.Risorsa.class);
            listaRisorse.add(risorsaMappata);

        }
       return listaRisorse;
    };





}
