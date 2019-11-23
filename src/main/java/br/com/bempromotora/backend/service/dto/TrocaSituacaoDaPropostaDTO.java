package br.com.bempromotora.backend.service.dto;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessorDTO;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.SituacaoPropostaCreditoEnum;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TrocaSituacaoDaPropostaDTO extends AbstractProcessorDTO {

    private PropostaEntity proposta;

    private SituacaoPropostaCreditoEnum novaSituacao;

    @Builder
    @Data
    public static class Retorno extends AbstractProcessorDTO{

        private PropostaEntity propostaComNovaSituacao;
    }


}
