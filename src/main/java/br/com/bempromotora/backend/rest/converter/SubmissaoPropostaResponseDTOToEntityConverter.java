package br.com.bempromotora.backend.rest.converter;

import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.rest.dto.proposta.PropostaDTO;
import br.com.bempromotora.backend.rest.dto.proposta.SubmissaoPropostaResponseDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import br.com.bempromotora.backend.service.dto.SubmissaoPropostaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SubmissaoPropostaResponseDTOToEntityConverter implements RestConverter<SubmissaoPropostaResponse, SubmissaoPropostaResponseDTO> {

    @Autowired
    private PropostaEntityToDTOConverter propostaEntityToDTOConverter;

    @Override
    public SubmissaoPropostaResponseDTO convert(SubmissaoPropostaResponse submissaoPropostaResponse) {
        String detalhes = submissaoPropostaResponse.getDetalhes();
        boolean submetida = submissaoPropostaResponse.isSubmetida();

        PropostaEntity propostaEntity = submissaoPropostaResponse.getPropostaEntity();
        PropostaDTO propostaDTO = propostaEntityToDTOConverter.convert(propostaEntity);

        return SubmissaoPropostaResponseDTO.builder()
                .detalhes(detalhes)
                .isSubmetida(submetida)
                .propostaDTO(propostaDTO)
                .build();
    }

}
