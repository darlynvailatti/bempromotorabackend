package common;

import java.math.BigDecimal;

public class Valor {

    private BigDecimal conteudo;

    public Valor(Number numero){
        this.conteudo = BigDecimal.valueOf(numero.doubleValue());
    }
}
