package test.builder;

import java.time.LocalDate;

import common.Data;
import common.Periodo;
import domain.cliente.ClienteEntity;
import domain.cliente.ConvenioClienteEntity;
import domain.cliente.ConvenioEntity;
import domain.parceiro.PessoasFisicaEntity;
import domain.parceiro.ParceiroEntity;
import domain.cliente.SituacaoConvenioEnum;
import domain.parceiro.LocalidadeEntity;
import domain.parceiro.LogradouroEntity;
public class ClienteBuilder {

    private ClienteBuilder(){}

    public static ClienteEntity clienteComLocalidade(){
        ParceiroEntity parceiro=new ParceiroEntity();
        PessoasFisicaEntity pessoafisica=new PessoasFisicaEntity();
        parceiro.setIdParceiro(1l);
        pessoafisica.setParceiro(parceiro);
        pessoafisica.setCPF("08557752971");
        
    	ClienteEntity padrao = new ClienteEntity();
        padrao.setCliente(pessoafisica)
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
        ConvenioClienteEntity convenioCliente = new ConvenioClienteEntity(inss, cliente, vigencia);
        return cliente;
    }

}
