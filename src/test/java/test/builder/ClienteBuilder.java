package test.builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

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


    public static ClienteEntity ClienteComEndereco(){
    
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
        
        LogradouroEntity endereco = new LogradouroEntity();
        endereco.setCEP("08088328");
        endereco.setIdLogradouro(1l);
        endereco.setEndereco("R. da Conceicao");
        endereco.setNumero("193D");
        endereco.setLocalidade(localidade);
       
        /*
        Set<EnderecoEntity> enderecos = new HashSet<>();
        enderecos.add(endereco);
        padrao.setEnderecos(enderecos);
		*/
        return padrao;
        
    }

    public static ClienteEntity semConvenio(){
        return ClienteComEndereco();
    }

    public static ClienteEntity comStiuacaoDeConvenio(SituacaoConvenioEnum situacao) {
        ConvenioEntity inss = ConvenioBuilder.INSS();
        ClienteEntity cliente = ClienteComEndereco();
        Data umDoQuatroDeDezenove = Data.em(1, 4, 2019);
        Data trintaEUmDoDozeDeDezenove = Data.em(31, 12, 2019);
        Periodo vigencia = Periodo.de(umDoQuatroDeDezenove, trintaEUmDoDozeDeDezenove);
        ConvenioClienteEntity convenioCliente = new ConvenioClienteEntity(inss, cliente, vigencia);
        return cliente;
    }

}
