package br.com.bempromotora.backend.service.dto;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessorDTO;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.SituacaoPropostaCreditoEnum;

public class TrocaSituacaoDaPropostaDTO extends AbstractProcessorDTO {

    private PropostaEntity proposta;

    private SituacaoPropostaCreditoEnum novaSituacao;

    public TrocaSituacaoDaPropostaDTO(PropostaEntity proposta, SituacaoPropostaCreditoEnum novaSituacao) {
        this.proposta = proposta;
        this.novaSituacao = novaSituacao;
    }

    public static class Retorno extends AbstractProcessorDTO{

        private PropostaEntity propostaComNovaSituacao;

        public Retorno(PropostaEntity propostaComNovaSituacao) {
            this.propostaComNovaSituacao = propostaComNovaSituacao;
        }

        public PropostaEntity getPropostaComNovaSituacao() {
            return propostaComNovaSituacao;
        }

        public void setPropostaComNovaSituacao(PropostaEntity propostaComNovaSituacao) {
            this.propostaComNovaSituacao = propostaComNovaSituacao;
        }
    }

    public PropostaEntity getProposta() {
        return proposta;
    }

    public void setProposta(PropostaEntity proposta) {
        this.proposta = proposta;
    }

    public SituacaoPropostaCreditoEnum getNovaSituacao() {
        return novaSituacao;
    }

    public void setNovaSituacao(SituacaoPropostaCreditoEnum novaSituacao) {
        this.novaSituacao = novaSituacao;
    }
}
