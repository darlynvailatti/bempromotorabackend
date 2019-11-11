package br.com.bempromotora.backend.domain.proposta.regra.validador;

import br.com.bempromotora.backend.architecture.util.EnsuresThat;
import br.com.bempromotora.backend.domain.chavevalor.*;
import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioClienteEntity;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.regra.OperadorRegraEnum;
import br.com.bempromotora.backend.domain.proposta.regra.RegraEntity;

import java.time.LocalDate;
import java.time.Period;

public class ValidadorRegraCampoPropostaIdade implements IValidadorRegraProposta {

    private static final String ENTIDADE = PropostaEntity.class.getSimpleName();

    private static final String CAMPO_VALIDACAO = "idade";

    @Override
    public boolean aceitaValidar(RegraEntity regra) {
        InformacaoEntity informacaoComparacao = regra.getInformacaoComparacao();
        EstruturaDeRegistroEntity estrutura = informacaoComparacao.getEstrutura();
        RegistroEntity registroDeInformacao = informacaoComparacao.getRegistroDeInformacao();
        EntidadeEntity entidade = registroDeInformacao.getEntidade();
        String descricaoDaEntidadeDaRegra = entidade.getDescricao();
        CampoDeEntidadeEntity campo = estrutura.getCampoPosVigencia();
        String descricaoDoCampoDaRegra = campo.getDescricao();

        boolean entidadeEhValida = descricaoDaEntidadeDaRegra.equalsIgnoreCase(ENTIDADE);
        boolean campoEhValido = descricaoDoCampoDaRegra.equalsIgnoreCase(CAMPO_VALIDACAO);

        return entidadeEhValida && campoEhValido;
    }

    @Override
    public void validar(RegraEntity regra, PropostaEntity proposta) throws Exception {

        ConvenioClienteEntity convenioCliente = proposta.getConvenioCliente();
        ClienteEntity cliente = convenioCliente.getCliente();
        LocalDate dataNascimento = cliente.getDataNascimento();

        Period idadeDoCliente = Period.between(dataNascimento, LocalDate.now());
        int idadeDoClienteEmAnos = idadeDoCliente.getYears();

        InformacaoEntity informacaoComparacao = regra.getInformacaoComparacao();
        ConteudoEntity conteudoDoCampoRelacionadoARegra = informacaoComparacao.getConteudo();

        ValoresInteiroEntity valorInteiroDoCampoNaRegra = conteudoDoCampoRelacionadoARegra.getConteudoValoresInteiro();
        Integer valorInteiroNaRegra = valorInteiroDoCampoNaRegra.getValorInteiro();

        OperadorRegraEnum operadorDeComparacaoNaRegra = regra.getOperadorComparacao();

        boolean regraAtendida = Boolean.FALSE;
        switch (operadorDeComparacaoNaRegra) {
            case MENOR_IGUAL:
                regraAtendida = idadeDoClienteEmAnos <= valorInteiroNaRegra.intValue();
                EnsuresThat.isTrue(regraAtendida, "Idade do cliente da proposta deve ser menor ou igual a {0}", valorInteiroNaRegra);
                break;
            case MAIOR_IGUAL:
                regraAtendida = idadeDoClienteEmAnos >= valorInteiroNaRegra.intValue();
                EnsuresThat.isTrue(regraAtendida, "Idade do cliente da proposta deve ser maior ou igual a {0}", valorInteiroNaRegra);
        }

    }

}
