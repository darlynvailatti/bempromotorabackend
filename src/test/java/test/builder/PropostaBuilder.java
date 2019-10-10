package test.builder;

import domain.proposta.PropostaEntity;

public class PropostaBuilder {
	
	private PropostaBuilder() {} 
	
	public static PropostaEntity padrao() {
		return new PropostaEntity();
	}

}
