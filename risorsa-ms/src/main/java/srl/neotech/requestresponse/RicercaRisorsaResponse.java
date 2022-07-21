package srl.neotech.requestresponse;

import srl.neotech.model.Risorsa;

import java.util.ArrayList;

public class RicercaRisorsaResponse extends ResponseBase{

    private ArrayList <Risorsa>risorse=new ArrayList<>();

    public ArrayList<Risorsa> getRisorse() {
        return risorse;
    }

    public void setRisorse(ArrayList<Risorsa> risorse) {
        this.risorse = risorse;
    }
}
