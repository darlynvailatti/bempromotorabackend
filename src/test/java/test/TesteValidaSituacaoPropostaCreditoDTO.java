package test;

import static org.junit.jupiter.api.Assertions.fail;

import domain.PropostaEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domain.propostacredito.SituacaoPropostaCreditoEnum;

public class TesteValidaSituacaoPropostaCreditoDTO {
	//
	PropostaEntity proposta = new PropostaEntity();

	@Test
	public void situacaoAberta() {
		// caminho feliz
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.EM_EDICAO);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.ABERTA);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.ABERTA, proposta.getSituacao(), "Proposta não está aberta");
		//fail
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.EM_EDICAO);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.APROVADA);
		Assertions.assertNotEquals(SituacaoPropostaCreditoEnum.APROVADA, proposta.getSituacao(), "Proposta não está aberta");

	}

	@Test
	public void situacaoPendenteAnalise() {
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.ABERTA);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.PENDENTE_DE_ANALISE);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.PENDENTE_DE_ANALISE, proposta.getSituacao(),
				"Proposta não está aberta");
		
		//fail
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.ABERTA);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.APROVADA);
		Assertions.assertNotEquals(SituacaoPropostaCreditoEnum.APROVADA, proposta.getSituacao(), "Proposta está aberta");

		
	}

	@Test
	public void situacaoSubmetidaParaAnalise() {
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.ABERTA);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.SUBMETIDA_PARA_ANALISE);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.SUBMETIDA_PARA_ANALISE, proposta.getSituacao(),
				"Proposta não está aberta");
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.PENDENTE_DE_ANALISE);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.SUBMETIDA_PARA_ANALISE);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.SUBMETIDA_PARA_ANALISE, proposta.getSituacao(),
				"Proposta não está pendente");
		
		//fail
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.PENDENTE_DE_ANALISE);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.APROVADA);
		Assertions.assertNotEquals(SituacaoPropostaCreditoEnum.SUBMETIDA_PARA_ANALISE, proposta.getSituacao(),
				"Proposta não está pendente");

		
	}

	@Test
	public void situacaoAprovada() {
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.SUBMETIDA_PARA_ANALISE);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.APROVADA);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.APROVADA, proposta.getSituacao(), "Proposta não está analise");
		
		//fail
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.SUBMETIDA_PARA_ANALISE);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.PROCESSANDO_PAGAMENTO);
		Assertions.assertNotEquals(SituacaoPropostaCreditoEnum.APROVADA, proposta.getSituacao(), "Proposta não está analise");

	}

	@Test
	public void situacaoReprovada() {
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.SUBMETIDA_PARA_ANALISE);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.REPROVADA);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.REPROVADA, proposta.getSituacao(), "Proposta não está analise");
		//fail
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.APROVADA);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.REPROVADA);
		Assertions.assertNotEquals(SituacaoPropostaCreditoEnum.REPROVADA, proposta.getSituacao(), "Proposta está aprovada");

	}

	@Test
	public void situacaoCancelada() {
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.ABERTA);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.CANCELADA);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.PENDENTE_DE_ANALISE);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.CANCELADA);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.SUBMETIDA_PARA_ANALISE);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.CANCELADA);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.APROVADA);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.CANCELADA);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.ANALISE_NO_CONVENIO);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.CANCELADA);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");

		//fail
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.PAGAMENTO_EFETUADO);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.CANCELADA);
		Assertions.assertNotEquals(SituacaoPropostaCreditoEnum.CANCELADA, proposta.getSituacao(),
				"Proposta Nao pode ser cancelada");

	}

	@Test
	public void situacaoAnaliseNoConvenio() {
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.APROVADA);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.ANALISE_NO_CONVENIO);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.ANALISE_NO_CONVENIO, proposta.getSituacao(),
				"Proposta Nao pode ir ao convênio");
		//fail
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.REPROVADA);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.ANALISE_NO_CONVENIO);
		Assertions.assertNotEquals(SituacaoPropostaCreditoEnum.ANALISE_NO_CONVENIO, proposta.getSituacao(),
				"Proposta Nao pode ir ao convênio");		
	}

	@Test
	public void situacaoReprovadaNoConvenio() {
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.ANALISE_NO_CONVENIO);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.REPROVADA_NO_CONVENIO);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.REPROVADA_NO_CONVENIO, proposta.getSituacao(),
				"Convenio nao pode reprovar");
		//fail
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.PROCESSANDO_PAGAMENTO);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.REPROVADA_NO_CONVENIO);
		Assertions.assertNotEquals(SituacaoPropostaCreditoEnum.REPROVADA_NO_CONVENIO, proposta.getSituacao(),
				"Convenio nao pode reprovar");

	}

	@Test
	public void situacaoProcessandoPagamento() {
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.ANALISE_NO_CONVENIO);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.PROCESSANDO_PAGAMENTO);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.PROCESSANDO_PAGAMENTO, proposta.getSituacao(),
				"Não pode processar pagamento");
		//fail
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.REPROVADA_NO_CONVENIO);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.PROCESSANDO_PAGAMENTO);
		Assertions.assertNotEquals(SituacaoPropostaCreditoEnum.PROCESSANDO_PAGAMENTO, proposta.getSituacao(),
				"Não pode processar pagamento");

		
	}

	@Test
	public void situacaoPagamentoEfetuado() {
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.PROCESSANDO_PAGAMENTO);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.PAGAMENTO_EFETUADO);
		Assertions.assertEquals(SituacaoPropostaCreditoEnum.PAGAMENTO_EFETUADO, proposta.getSituacao(),
				"Não pode processar pagamento");
		//fail
		proposta = instaceProposta(SituacaoPropostaCreditoEnum.ANALISE_NO_CONVENIO);
		proposta.setSituacao(SituacaoPropostaCreditoEnum.PAGAMENTO_EFETUADO);
		Assertions.assertNotEquals(SituacaoPropostaCreditoEnum.PAGAMENTO_EFETUADO, proposta.getSituacao(),
				"Não pode processar pagamento");

	}

	public PropostaEntity instaceProposta(SituacaoPropostaCreditoEnum situacao) {
		PropostaEntity proposta = new Proposta();
		proposta.startSituacao(situacao);
		return  proposta;
	}

}
