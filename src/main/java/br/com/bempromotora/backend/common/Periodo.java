package br.com.bempromotora.backend.common;

import javax.persistence.Embeddable;

@lombok.Data
@Embeddable
public class Periodo {

    private Data inicio;

    private Data fim;

    public Periodo(Data inicio, Data fim){
        this.setInicio(inicio);
        this.setFim(fim);
    }

    public static Periodo de(Data inicio, Data fim){
        return new Periodo(inicio, fim);
    }

}
