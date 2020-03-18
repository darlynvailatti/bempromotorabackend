package br.com.bempromotora.backend.service.dto;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessorDTO;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.SituacaoPropostaEnum;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TrocaSituacaoDaProposta extends AbstractProcessorDTO {

    private PropostaEntity proposta;

    private SituacaoPropostaEnum novaSituacao;

    @Builder
    @Data
    public static class Retorno extends AbstractProcessorDTO{

        private PropostaEntity propostaComNovaSituacao;
    }


}
