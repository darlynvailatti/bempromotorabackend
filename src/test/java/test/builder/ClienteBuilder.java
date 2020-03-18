package test.builder;

import java.time.LocalDate;

import br.com.bempromotora.backend.common.Data;
import br.com.bempromotora.backend.common.Periodo;
import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import br.com.bempromotora.backend.domain.parceiro.PessoasFisicaEntity;
import br.com.bempromotora.backend.domain.parceiro.ParceiroEntity;
import br.com.bempromotora.backend.domain.cliente.SituacaoConvenioEnum;
import br.com.bempromotora.backend.domain.parceiro.LocalidadeEntity;
import br.com.bempromotora.backend.domain.parceiro.LogradouroEntity;
public class ClienteBuilder {

    private ClienteBuilder(){}

    public static ClienteEntity clienteComLocalidade(){
        ParceiroEntity parceiro=new ParceiroEntity();
        PessoasFisicaEntity pessoafisica=new PessoasFisicaEntity();
        parceiro.setId(1l);
        pessoafisica.setParceiro(parceiro);
        pessoafisica.setCpf("08557752971");
        
    	ClienteEntity padrao = new ClienteEntity();
        padrao.setPessoaFisica(pessoafisica)
        ;
        padrao.setNome("Gandalf");
        padrao.setDataNascimento(LocalDate.of(2037, 10, 12));

        LocalidadeEntity localidade=new LocalidadeEntity();
        localidade.setIdLocalidade(1l);
        localidade.setParceiro(parceiro);
        localidade.setResidencialouComercial("R");  //Residencial
        localidade.setDescricao("Endereco do filho, pois moram juntos");
        
        LogradouroEntity logradouro = new LogradouroEntity();
        logradouro.setCEP("08088328");
        logradouro.setIdLogradouro(1l);
        logradouro.setEndereco("R. da Conceicao");
        logradouro.setNumero("193D");
        logradouro.setLocalidade(localidade);
        return padrao;
    }

    public static ClienteEntity semConvenio(){
        return clienteComLocalidade();
    }

    public static ClienteEntity comStiuacaoDeConvenio(SituacaoConvenioEnum situacao) {
        ConvenioEntity inss = ConvenioBuilder.INSS();
        ClienteEntity cliente = clienteComLocalidade();
        Data umDoQuatroDeDezenove = Data.em(1, 4, 2019);
        Data trintaEUmDoDozeDeDezenove = Data.em(31, 12, 2019);
        Periodo vigencia = Periodo.de(umDoQuatroDeDezenove, trintaEUmDoDozeDeDezenove);

        ConvenioClienteEntity convenioCliente = new ConvenioClienteEntity();
        convenioCliente.setConvenio(inss);
        convenioCliente.setCliente(cliente);
        convenioCliente.setDataEntrada(vigencia.getInicio().getConteudo().toLocalDate());
        convenioCliente.setDataFim(vigencia.getFim().getConteudo().toLocalDate());
        return cliente;
    }

}
