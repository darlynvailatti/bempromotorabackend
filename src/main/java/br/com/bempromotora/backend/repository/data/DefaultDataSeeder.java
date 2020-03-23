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
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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

        List<String> nomes = Arrays.asList("Gandalf", "Galadriel", "Aragorn", "Sam Wise", "Boromir of Gondor");
        List<String> cpfs = Arrays.asList("65217381923", "21342312313", "36784324443", "4397463738", "424823718332");
        List<String> matriculasConvenio = Arrays.asList("2131231312", "9654859305", "906587328", "49376238902", "534423453");
        List<LocalDate> datasNascimento = Arrays.asList(
                LocalDate.now().minusYears(30),
                LocalDate.now().minusYears(35),
                LocalDate.now().minusYears(78),
                LocalDate.now().minusYears(56),
                LocalDate.now().minusYears(79)
        );


        ConvenioEntity siape = new ConvenioEntity();
        siape.setDescricao("SIAPE");
        siape = convenioRepository.save(siape);

        ConvenioEntity inss = new ConvenioEntity();
        inss.setDescricao("INSS");
        inss = convenioRepository.save(inss);

        List<ConvenioEntity> convenios = Arrays.asList(
                inss, siape
        );


        int size = 5;

        for(int i=0;i<size;i++) {

            ClienteEntity cliente = new ClienteEntity();
            cliente.setDataNascimento(datasNascimento.get(i));
            cliente.setNome(nomes.get(i));
            cliente.setBloqueado(false);

            PessoasFisicaEntity pessoaFisica = new PessoasFisicaEntity();
            pessoaFisica.setCpf(cpfs.get(i));

            pessoaFisica = pessoasFisicaRepository.save(pessoaFisica);
            cliente.setPessoaFisica(pessoaFisica);

            cliente = clienteRepository.save(cliente);


            Random random = new Random();

            ConvenioClienteEntity convenio = new ConvenioClienteEntity();
            convenio.setCliente(cliente);
            convenio.setConvenio(convenios.get(random.nextInt(1)));



            int anoEntradaNoConvenio = random.nextInt( 2020 + 1) + 1940;
            int anoSaidaNoConvenio = random.nextInt(2020 + 1) + anoEntradaNoConvenio;

            convenio.setDataEntrada(
                    LocalDate.of
                        (anoEntradaNoConvenio,
                                random.nextInt(12) + 1,
                                random.nextInt(31) + 1)
                        );
            convenio.setDataFim(LocalDate.of
                    (anoSaidaNoConvenio,
                            random.nextInt(12) + 1,
                            random.nextInt(31) + 1)
            );


            convenio.setMatricula(matriculasConvenio.get(0));
            convenioClienteRepository.save(convenio);

        }
    }

}
