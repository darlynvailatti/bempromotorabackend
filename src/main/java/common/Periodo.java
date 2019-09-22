package common;

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

	public Data getInicio() {
		return inicio;
	}

	public void setInicio(Data inicio) {
		this.inicio = inicio;
	}

	public Data getFim() {
		return fim;
	}

	public void setFim(Data fim) {
		this.fim = fim;
	}
}
