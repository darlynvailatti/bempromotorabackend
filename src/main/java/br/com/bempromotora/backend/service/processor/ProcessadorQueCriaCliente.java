package br.com.bempromotora.backend.service.processor;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessor;
import br.com.bempromotora.backend.architecture.util.EnsuresThat;
import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import br.com.bempromotora.backend.domain.parceiro.PessoasFisicaEntity;
import br.com.bempromotora.backend.repository.IClienteRepository;
import br.com.bempromotora.backend.repository.IConvenioClienteRepository;
import br.com.bempromotora.backend.repository.IConvenioRepository;
import br.com.bempromotora.backend.repository.IPessoasFisicaRepository;
import br.com.bempromotora.backend.service.dto.CreateClienteRequest;
import br.com.bempromotora.backend.service.dto.CreateClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class ProcessadorQueCriaCliente extends AbstractProcessor<CreateClienteRequest, CreateClienteResponse> {

    @Autowired
    private IPessoasFisicaRepository pessoasFisicaRepository;

    @Autowired
    private IClienteRepository clienteRepository;

    @Autowired
    private IConvenioRepository convenioRepository;

    @Autowired
    private IConvenioClienteRepository convenioClienteRepository;

    private ClienteEntity clienteEntity;

    private ConvenioEntity convenioEntity;

    private PessoasFisicaEntity pessoasFisicaEntity;

    @Override
    protected void validateInput() throws Exception {
        EnsuresThat.isNotNull(input.getCpf(), "CPF é obrigatório");
        EnsuresThat.isNotNull(input.getNome(), "Nome é obrigatório");
        EnsuresThat.isNotNull(input.getDataNascimento(), "Data nascimento é obrigatória");
        EnsuresThat.isNotNull(input.getIdConvenio(), "Convênio é obrigatório");
    }

    @Override
    protected void executionImplementation() throws Exception {
        clienteEntity = new ClienteEntity();

        String nome = input.getNome();
        LocalDate dataNascimento = input.getDataNascimento();

        criarPessoaFisica();

        clienteEntity.setPessoaFisica(pessoasFisicaEntity);
        clienteEntity.setBloqueado(false);
        clienteEntity.setNome(nome);
        clienteEntity.setDataNascimento(dataNascimento);

        clienteEntity = clienteRepository.save(clienteEntity);

        criarRelacaoConvenioCliente();

    }

    private void criarPessoaFisica() {
        pessoasFisicaEntity = new PessoasFisicaEntity();
        pessoasFisicaEntity.setCpf(input.getCpf());
        pessoasFisicaEntity = pessoasFisicaRepository.save(pessoasFisicaEntity);
    }

    private void criarRelacaoConvenioCliente() throws Exception {
        Optional<ConvenioEntity> convenioById = convenioRepository.findById(input.getIdConvenio());
        EnsuresThat.isTrue(convenioById.isPresent(), "Convênio {0} não existe");
        convenioEntity = convenioById.get();
        convenioEntity = convenioRepository.save(convenioEntity);

        ConvenioClienteEntity convenioClienteEntity = new ConvenioClienteEntity();
        convenioClienteEntity.setCliente(clienteEntity);
        convenioClienteEntity.setConvenio(convenioEntity);
        convenioClienteEntity.setMatricula(input.getMatriculaConvenio());
        convenioClienteEntity.setDataEntrada(input.getDataEntradaConvenio());
        convenioClienteEntity = convenioClienteRepository.save(convenioClienteEntity);
    }

    @Override
    protected CreateClienteResponse executionReturn() throws Exception {
        return CreateClienteResponse.builder()
                .clienteEntity(clienteEntity)
                .build();
    }

    @Override
    protected String getName() {
        return ProcessadorQueCriaCliente.class.getSimpleName();
    }
}
