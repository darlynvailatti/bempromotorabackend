package test.builder;

import br.com.bempromotora.backend.domain.proposta.PropostaEntity;

public class PropostaBuilder {
	
	private PropostaBuilder() {} 
	
	public static PropostaEntity padrao() {
		return new PropostaEntity();
	}

}
