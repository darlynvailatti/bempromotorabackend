package br.com.bempromotora.backend.rest.converter;

import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.repository.IPropostaRepository;
import br.com.bempromotora.backend.rest.dto.proposta.PropostaDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropostaDTOToEntityConverter implements RestConverter<PropostaDTO, PropostaEntity> {

    @Autowired
    private IPropostaRepository propostaRepository;


    @Override
    public PropostaEntity convert(PropostaDTO propostaDTO) {
        Long idProposta = propostaDTO.getIdProposta();
        return propostaRepository.findById(idProposta).get();
    }

}
