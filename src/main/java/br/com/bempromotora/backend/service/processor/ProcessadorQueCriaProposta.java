package br.com.bempromotora.backend.service.processor;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessor;
import br.com.bempromotora.backend.architecture.util.EnsuresThat;
import br.com.bempromotora.backend.common.Data;
import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.SituacaoPropostaEnum;
import br.com.bempromotora.backend.repository.IConvenioClienteRepository;
import br.com.bempromotora.backend.repository.IPropostaRepository;
import br.com.bempromotora.backend.service.dto.CreatePropostaRequest;
import br.com.bempromotora.backend.service.dto.CreatePropostaResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProcessadorQueCriaProposta extends AbstractProcessor<CreatePropostaRequest, CreatePropostaResponse> {

    @Autowired
    private IConvenioClienteRepository convenioClienteRepository;

    @Autowired
    private IPropostaRepository propostaRepository;

    private PropostaEntity propostaEntity;

    @Override
    protected void validateInput() throws Exception {
        EnsuresThat.isNotNull(input.getCliente(), "Cliente é obrigatório");
        EnsuresThat.isNotNull(input.getValor(), "Valor é obrigatório");
    }

    @Override
    protected void executionImplementation() throws Exception {
        propostaEntity = new PropostaEntity();
        propostaEntity.setSituacao(SituacaoPropostaEnum.ABERTA);
        propostaEntity.setData(Data.hoje().getConteudo());
        propostaEntity.setObservacao(input.getObservacao());
        propostaEntity.setValor(input.getValor());

        ClienteEntity cliente = input.getCliente();

        ConvenioClienteEntity convenioDoCliente = convenioClienteRepository.findByCliente(cliente);
        EnsuresThat.isNotNull(convenioDoCliente, "O cliente {0} não possui convênio", cliente);

        propostaEntity.setConvenioCliente(convenioDoCliente);
        propostaEntity = propostaRepository.save(propostaEntity);
    }

    @Override
    protected CreatePropostaResponse executionReturn() throws Exception {
        return CreatePropostaResponse.builder()
                .proposta(propostaEntity)
                .build();
    }

    @Override
    protected String getName() {
        return ProcessadorQueCriaProposta.class.getName();
    }

}
