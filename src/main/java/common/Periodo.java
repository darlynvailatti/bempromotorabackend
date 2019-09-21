package common;

public class Periodo {

    private Data inicio;

    private Data fim;

    public Periodo(Data inicio, Data fim){
        this.inicio = inicio;
        this.fim = fim;
    }

    public static Periodo de(Data inicio, Data fim){
        return new Periodo(inicio, fim);
    }
}
