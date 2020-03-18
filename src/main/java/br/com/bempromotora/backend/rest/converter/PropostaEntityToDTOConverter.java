package br.com.bempromotora.backend.rest.converter;

import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.rest.dto.ConvenioDTO;
import br.com.bempromotora.backend.rest.dto.cliente.ClienteDTO;
import br.com.bempromotora.backend.rest.dto.proposta.PropostaDTO;
import br.com.bempromotora.backend.rest.dto.proposta.SituacaoPropostaEnumDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropostaEntityToDTOConverter implements RestConverter<PropostaEntity, PropostaDTO> {

    @Autowired
    private ClienteEntityToDTOConverter clienteEntityToDTOConverter;

    @Autowired
    private ConvenioEntityToDTOConverter convenioEntityToDTOConverter;


    @Override
    public PropostaDTO convert(PropostaEntity propostaEntity) {
        PropostaDTO propostaDTO = new PropostaDTO();

        ConvenioClienteEntity convenioClienteEntity = propostaEntity.getConvenioCliente();
        ClienteEntity cliente = convenioClienteEntity.getCliente();
        ClienteDTO clienteDTO = clienteEntityToDTOConverter.convert(cliente);
        propostaDTO.setCliente(clienteDTO);

        ConvenioEntity convenioEntity = convenioClienteEntity.getConvenio();
        ConvenioDTO convenioDTO = convenioEntityToDTOConverter.convert(convenioEntity);
        propostaDTO.setConvenio(convenioDTO.getDescricao());

        propostaDTO.setData(propostaEntity.getData());
        propostaDTO.setIdProposta(propostaEntity.getIdProposta());
        propostaDTO.setMatriculaConvenio(convenioClienteEntity.getMatricula());
        propostaDTO.setObservacao(propostaEntity.getObservacao());
        propostaDTO.setSituacao(SituacaoPropostaEnumDTO.valueOf(propostaEntity.getSituacao().name()));

        return propostaDTO;
    }

}
