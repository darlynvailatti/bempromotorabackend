package br.com.bempromotora.backend.repository.data;


import br.com.bempromotora.backend.common.Data;
import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import br.com.bempromotora.backend.domain.parceiro.PessoasFisicaEntity;
import br.com.bempromotora.backend.repository.IClienteRepository;
import br.com.bempromotora.backend.repository.IConvenioClienteRepository;
import br.com.bempromotora.backend.repository.IConvenioRepository;
import br.com.bempromotora.backend.repository.IPessoasFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class DefaultDataSeeder {


    @Autowired
    private IConvenioClienteRepository convenioClienteRepository;

    @Autowired
    private IConvenioRepository convenioRepository;

    @Autowired
    private IClienteRepository clienteRepository;

    @Autowired
    private IPessoasFisicaRepository pessoasFisicaRepository;


    @EventListener
    public void seed(ContextRefreshedEvent event) {

        ConvenioEntity siape = new ConvenioEntity();
        siape.setDescricao("SIAPE");
        siape = convenioRepository.save(siape);


        ClienteEntity gandalfcliente = new ClienteEntity();
        gandalfcliente.setDataNascimento(LocalDate.now());
        gandalfcliente.setNome("Gandalf o Cinzento");
        gandalfcliente.setBloqueado(false);

        PessoasFisicaEntity gandalfPessoaFisica = new PessoasFisicaEntity();
        gandalfPessoaFisica.setCpf("08557752970");

        gandalfPessoaFisica = pessoasFisicaRepository.save(gandalfPessoaFisica);
        gandalfcliente.setPessoaFisica(gandalfPessoaFisica);

        gandalfcliente = clienteRepository.save(gandalfcliente);

        ConvenioClienteEntity convenioDoGandalf = new ConvenioClienteEntity();
        convenioDoGandalf.setCliente(gandalfcliente);
        convenioDoGandalf.setConvenio(siape);
        convenioDoGandalf.setDataEntrada(Data.em(1, 2, 2005).getConteudo().toLocalDate());
        convenioDoGandalf.setDataFim(Data.em(1, 2, 2023).getConteudo().toLocalDate());
        convenioDoGandalf.setMatricula("23868912032");

        convenioClienteRepository.save(convenioDoGandalf);
    }

}
