package test.builder;

import common.Data;
import common.Periodo;
import domain.*;

import java.util.HashSet;
import java.util.Set;

public class ClienteBuilder {


    public static ClienteEntity ClienteComEndereco(){
        ClienteEntity padrao = new ClienteEntity();
        padrao.setCpf("08557752971");
        padrao.setNome("Gandalf");
        padrao.setId(1L);

        EnderecoEntity endereco = new EnderecoEntity();
        endereco.setCep("08088328");
        endereco.setId(1L);
        endereco.setLogradouro("R. da Conceicao 193D");
        endereco.setParceiro(padrao);

        Data umDoQuatroDeDezenove = Data.em(1, 4, 2019);
        Data trintaEUmDoDozeDeDezenove = Data.em(31, 12, 2019);
        Periodo vigencia = Periodo.de(umDoQuatroDeDezenove, trintaEUmDoDozeDeDezenove);
        endereco.setVigencia(vigencia);

        Set<EnderecoEntity> enderecos = new HashSet<>();
        enderecos.add(endereco);
        padrao.setEnderecos(enderecos);
        return padrao;
    }

    public static Cliente semConvenio(){
        return ClienteComEndereco();
    }

    public static Cliente comStiuacaoDeConvenio(SituacaoConvenioEnum situacao) {
        Convenio inss = ConvenioBuilder.INSS();
        Cliente cliente = ClienteComEndereco();
        ConvenioCliente convenioCliente = new ConvenioCliente(inss, cliente, situacao);
        cliente.setConvenio(convenioCliente);
        return cliente;
    }

}
