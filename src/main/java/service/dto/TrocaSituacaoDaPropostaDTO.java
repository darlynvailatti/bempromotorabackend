package service.dto;

import architecture.logic.processor.pattern.AbstractProcessorDTO;
import domain.proposta.PropostaEntity;
import domain.proposta.SituacaoPropostaCreditoEnum;

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
