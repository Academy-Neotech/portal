package srl.neotech.requestresponse;

import srl.neotech.model.Risorsa;

public class GetRisorsaResponse extends ResponseBase{

   private Risorsa risorsa;

    public Risorsa getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorsa risorsa) {
        this.risorsa = risorsa;
    }
}
