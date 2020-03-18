package br.com.bempromotora.backend.service;

import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.service.dto.*;

import java.util.List;

public interface IPropostaService {

    List<PropostaEntity> getAllPropostas();

    PropostaEntity getProposta(Long idProposta);

    CreatePropostaResponse createProposta(CreatePropostaRequest createProposta);

    SubmissaoPropostaResponse submeterProposta(SubmissaoPropostaRequest submissaoPropostaRequest);

    ValidaRegrasSobreProposta.RetornoDTO validarRegrasSobreProposta(Long idProposta) throws Exception;

}
