package test;


import static br.com.bempromotora.backend.domain.proposta.SituacaoPropostaCreditoEnum.*;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.bempromotora.backend.architecture.exception.BusinessLogicException;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.SituacaoPropostaCreditoEnum;
import br.com.bempromotora.backend.service.dto.TrocaSituacaoDaPropostaDTO;
import br.com.bempromotora.backend.service.processor.ProcessadorQueTrocaSituacaoDaProposta;
import test.builder.PropostaBuilder;


public class TesteValidacaoSituacaoPropostaCredito {

    private static ProcessadorQueTrocaSituacaoDaProposta processadorQueAlteraSituacaoDaProposta;

    private final static String MENSAGEM_PADRAO_DE_ERRO_TROCA_SITUACAO = "Não pode trocar de {0} para {1}";
    
    @Before
    public void inicializar(){
        processadorQueAlteraSituacaoDaProposta = new ProcessadorQueTrocaSituacaoDaProposta();
    }

    @Test
    public void garantirQuePodeMudarDeSituacaoEmEdicaoParaSituacaoValida() {
    	List<SituacaoPropostaCreditoEnum> situacoesValidas = Arrays.asList(ABERTA);
    	garantirQuePodeTrocarSituacaoDePara(EM_EDICAO, situacoesValidas);
    }
    
    @Test
    public void garantirQueNaoPodeMudarDeSituacaoEmEdicaoParaSituacaoInvalida() {
    	List<SituacaoPropostaCreditoEnum> situacoesInvalidas = Arrays.asList(
    			SUBMETIDA_PARA_ANALISE, PENDENTE_DE_ANALISE, CANCELADA, APROVADA, REPROVADA, 
    			REPROVADA_NO_CONVENIO, ANALISE_NO_CONVENIO, PROCESSANDO_PAGAMENTO, PAGAMENTO_EFETUADO
    	);
    	garantirQueNaoPodeTrocarSituacaoDePara(EM_EDICAO, situacoesInvalidas);
    }
    
    @Test
    public void garantieQuePodeMudarDeSituacaoAbertaParaSituacaoValida() {
        List<SituacaoPropostaCreditoEnum> situacoesValidas = Arrays.asList(EM_EDICAO, SUBMETIDA_PARA_ANALISE, PENDENTE_DE_ANALISE, CANCELADA);
        garantirQuePodeTrocarSituacaoDePara(ABERTA, situacoesValidas);
    }

	@Test
    public void garantirQueNaoPodeMudarDeSituacaoAbertaParaSituacaoInvalida() {
    	List<SituacaoPropostaCreditoEnum> situacoesInvalidas = Arrays.asList(
    			APROVADA, REPROVADA, REPROVADA_NO_CONVENIO, ANALISE_NO_CONVENIO, PROCESSANDO_PAGAMENTO, PAGAMENTO_EFETUADO
    	);
    	garantirQueNaoPodeTrocarSituacaoDePara(ABERTA, situacoesInvalidas);
    }
    
	@Test
    public void garantirQuePodeMudarDeSituacaoSubmetidaParaAnaliseParaSituacaoValida() {
        List<SituacaoPropostaCreditoEnum> situacoesValidas = Arrays.asList(ABERTA, CANCELADA, APROVADA, REPROVADA);
        garantirQuePodeTrocarSituacaoDePara(SUBMETIDA_PARA_ANALISE, situacoesValidas);
    }
    
    @Test
    public void garantirQueNaoPodeMudarDeSituacaoSubmetidaParaAnaliseParaSituacaoInvalida() {
    	List<SituacaoPropostaCreditoEnum> situacoesInvalidas = Arrays.asList(
    			PENDENTE_DE_ANALISE, EM_EDICAO, REPROVADA_NO_CONVENIO, ANALISE_NO_CONVENIO, PROCESSANDO_PAGAMENTO, PAGAMENTO_EFETUADO
    	);
    	garantirQueNaoPodeTrocarSituacaoDePara(SUBMETIDA_PARA_ANALISE, situacoesInvalidas);
    }
    
    @Test
    public void garantirQuePodeMudarDePendenteDeAnaliseParaSituacaoValida() {
        List<SituacaoPropostaCreditoEnum> situacoesValidas = Arrays.asList(ABERTA, SUBMETIDA_PARA_ANALISE, CANCELADA);
    	garantirQuePodeTrocarSituacaoDePara(PENDENTE_DE_ANALISE, situacoesValidas);
    }
    
    @Test
    public void garantirQuePodeMudarDePendenteDeAnaliseParaSituacaoInvalida() {
    	List<SituacaoPropostaCreditoEnum> situacoesInvalidas = Arrays.asList(
    			EM_EDICAO, APROVADA, REPROVADA, REPROVADA_NO_CONVENIO, ANALISE_NO_CONVENIO, PROCESSANDO_PAGAMENTO, PAGAMENTO_EFETUADO
    	);
    	garantirQueNaoPodeTrocarSituacaoDePara(PENDENTE_DE_ANALISE, situacoesInvalidas);
    }
    
    @Test
    public void garantirQueNaoPodeMudarDeCanceladaParaSituacaoInvalida() {
    	List<SituacaoPropostaCreditoEnum> situacoesInvalidas = Arrays.asList(SituacaoPropostaCreditoEnum.values());
    	garantirQueNaoPodeTrocarSituacaoDePara(CANCELADA, situacoesInvalidas);
    }
    
    @Test
    public void garantirQuePodeMudarDeCanceladaParaSituacaoValida() {
    	List<SituacaoPropostaCreditoEnum> situacoesValidas = Arrays.asList();
    	garantirQueNaoPodeTrocarSituacaoDePara(CANCELADA, situacoesValidas);
    }
    
    @Test
    public void garantirQuePodeMudarDeAprovadaParaSituacaoValida() {
    	List<SituacaoPropostaCreditoEnum> situacoesValidas = Arrays.asList(CANCELADA, ANALISE_NO_CONVENIO);
    	garantirQuePodeTrocarSituacaoDePara(APROVADA, situacoesValidas);
    }
    
    @Test
    public void garantirQueNaoPodeMudarDeAprovadaParaSituacaoInvalida() {
    	List<SituacaoPropostaCreditoEnum> situacoesInvalidas = Arrays.asList(
    			EM_EDICAO, ABERTA, SUBMETIDA_PARA_ANALISE, PENDENTE_DE_ANALISE, 
    			REPROVADA, REPROVADA_NO_CONVENIO, PROCESSANDO_PAGAMENTO, PAGAMENTO_EFETUADO);
    	garantirQueNaoPodeTrocarSituacaoDePara(APROVADA, situacoesInvalidas);
    }
    
    @Test
    public void garantirQuePodeMudarDeReprovadaParaSituacaoValida() {
    	List<SituacaoPropostaCreditoEnum> situacoesValidas = Arrays.asList();
    	garantirQuePodeTrocarSituacaoDePara(REPROVADA, situacoesValidas);
    }
    
    @Test
    public void garantirQueNaoPodeMudarDeReprovadaParaSituacaoInvalida() {
    	List<SituacaoPropostaCreditoEnum> situacoesInvalidas = Arrays.asList(
    			EM_EDICAO, ABERTA, SUBMETIDA_PARA_ANALISE, PENDENTE_DE_ANALISE, CANCELADA,  APROVADA, 
    			REPROVADA, ANALISE_NO_CONVENIO, REPROVADA_NO_CONVENIO, PROCESSANDO_PAGAMENTO, PAGAMENTO_EFETUADO);
    	garantirQueNaoPodeTrocarSituacaoDePara(REPROVADA, situacoesInvalidas);
    }
    
    @Test
    public void garantriQueNaoPodeMudarDeAnaliseNoConvenioParaSituacaoInvalida() {
    	List<SituacaoPropostaCreditoEnum> situacoesInvalidas = Arrays.asList(
    			EM_EDICAO, ABERTA, SUBMETIDA_PARA_ANALISE, PENDENTE_DE_ANALISE,  APROVADA, PAGAMENTO_EFETUADO);
    	garantirQueNaoPodeTrocarSituacaoDePara(ANALISE_NO_CONVENIO, situacoesInvalidas);
    }
    
    @Test
    public void garantirQuePodeMudarDeAnaliseNoConvenioParaSituacaoValida() {
    	List<SituacaoPropostaCreditoEnum> situacoesValidas = Arrays.asList(CANCELADA, REPROVADA_NO_CONVENIO, PROCESSANDO_PAGAMENTO);
    	garantirQuePodeTrocarSituacaoDePara(ANALISE_NO_CONVENIO, situacoesValidas);
    }
    
    @Test
    public void garantirQueNaoPodeMudarDeProcessandoPagamentoParaSituacaoInvalida() {
    	List<SituacaoPropostaCreditoEnum> situacoesInvalidas = Arrays.asList(
    			EM_EDICAO, ABERTA, SUBMETIDA_PARA_ANALISE, PENDENTE_DE_ANALISE, CANCELADA,  APROVADA, 
    			REPROVADA, ANALISE_NO_CONVENIO, REPROVADA_NO_CONVENIO, PROCESSANDO_PAGAMENTO);
    	garantirQueNaoPodeTrocarSituacaoDePara(PROCESSANDO_PAGAMENTO, situacoesInvalidas);
    }
    
    @Test
    public void garantirQuePodeMudarDeProcessandoPagamentoParaSituacaoValida() {
    	List<SituacaoPropostaCreditoEnum> situacoesValidas = Arrays.asList(PAGAMENTO_EFETUADO);
    	garantirQuePodeTrocarSituacaoDePara(PROCESSANDO_PAGAMENTO, situacoesValidas);
    }
    
    private void garantirQueNaoPodeTrocarSituacaoDePara(SituacaoPropostaCreditoEnum situacaoDeTeste, List<SituacaoPropostaCreditoEnum> situacoesInvalidas) {
    	situacoesInvalidas.forEach(situacaoInvalida -> {
    		MessageFormat.format(MENSAGEM_PADRAO_DE_ERRO_TROCA_SITUACAO, situacaoDeTeste, situacaoInvalida);
    		PropostaEntity proposta = PropostaBuilder.padrao();
    		proposta.setSituacao(situacaoDeTeste);
    		assertThrows(BusinessLogicException.class, () -> {
				TrocaSituacaoDaPropostaDTO troca = TrocaSituacaoDaPropostaDTO.builder()
						.proposta(proposta)
						.novaSituacao(situacaoInvalida)
						.build();
    	        processadorQueAlteraSituacaoDaProposta.execute(troca);
        	});
    	});
	}
    
    private void garantirQuePodeTrocarSituacaoDePara(SituacaoPropostaCreditoEnum situacaoDeTeste, List<SituacaoPropostaCreditoEnum> situacoesValidas) {
    	situacoesValidas.forEach(situacaoValida -> {
    		String mensagemErro = MessageFormat.format(MENSAGEM_PADRAO_DE_ERRO_TROCA_SITUACAO, situacaoDeTeste, situacaoValida);
    		PropostaEntity proposta = PropostaBuilder.padrao();
    		proposta.setSituacao(situacaoDeTeste);
			TrocaSituacaoDaPropostaDTO troca = TrocaSituacaoDaPropostaDTO.builder()
					.proposta(proposta)
					.novaSituacao(situacaoDeTeste)
					.build();
	        try {
				processadorQueAlteraSituacaoDaProposta.execute(troca);
			} catch (BusinessLogicException e) {
				assertTrue(mensagemErro, false);
			}
    	});
	}

}