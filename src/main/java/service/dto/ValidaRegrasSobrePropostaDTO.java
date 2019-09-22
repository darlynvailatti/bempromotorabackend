package service.dto;

import architecture.logic.processor.pattern.AbstractProcessorDTO;
import architecture.transporte.pattern.AbstractDTO;
import domain.proposta.PropostaEntity;
import domain.proposta.regra.RegraEntity;

import java.util.Collection;

public class ValidaRegrasSobrePropostaDTO extends AbstractProcessorDTO {

    private final PropostaEntity proposta;

    private final Collection<RegraEntity> regras;

    public ValidaRegrasSobrePropostaDTO(PropostaEntity proposta, Collection<RegraEntity> regras) {
        this.proposta = proposta;
        this.regras = regras;
    }

    public static class RetornoDTO extends AbstractProcessorDTO{

        private final PropostaEntity proposta;

        private final Collection<RegraEntity> regras;

        private final Collection<String> resultados;

        public RetornoDTO(PropostaEntity proposta, Collection<RegraEntity> regras, Collection<String> resultados) {
            this.proposta = proposta;
            this.regras = regras;
            this.resultados = resultados;
        }

        public PropostaEntity getProposta() {
            return proposta;
        }

        public Collection<RegraEntity> getRegras() {
            return regras;
        }

        public Collection<String> getResultados() {
            return resultados;
        }
    }

    public PropostaEntity getProposta() {
        return proposta;
    }

    public Collection<RegraEntity> getRegras() {
        return regras;
    }
}
