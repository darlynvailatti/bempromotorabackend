package br.com.bempromotora.backend.rest.converter;

import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.rest.dto.proposta.CreatePropostaResponseDTO;
import br.com.bempromotora.backend.rest.dto.proposta.PropostaDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import br.com.bempromotora.backend.service.dto.CreatePropostaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePropostaResponseConverter implements RestConverter<CreatePropostaResponse, CreatePropostaResponseDTO> {

    @Autowired
    private PropostaEntityToDTOConverter propostaEntityToDTOConverter;

    @Override
    public CreatePropostaResponseDTO convert(CreatePropostaResponse createPropostaResponse) {
        PropostaEntity propostaEntity = createPropostaResponse.getProposta();
        PropostaDTO propostaDTO = propostaEntityToDTOConverter.convert(propostaEntity);
        CreatePropostaResponseDTO createPropostaResponseDTO = new CreatePropostaResponseDTO();
        createPropostaResponseDTO.setPropostaDTO(propostaDTO);
        return createPropostaResponseDTO;
    }
}
