package test;

import architecture.BPLogicException;
import domain.ClienteEntity;
import domain.SituacaoConvenioEnum;
import domain.logic.ProcessadorQueValidaVinculoDoClienteComOConvenio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import test.builder.ClienteBuilder;

public class TesteValidacaoDoVinculoDoClienteComOConvenio {

    private static ProcessadorQueValidaVinculoDoClienteComOConvenio processador;

    @BeforeAll
    public static void init(){
        processador = new ProcessadorQueValidaVinculoDoClienteComOConvenio();
    }

    @Test
    public void clienteConvenioInexistente() throws BPLogicException {
        ClienteEntity clienteSemConvenio = ClienteBuilder.semConvenio();
        ValidaVinculoDoClienteComOConvenioDTO validacao = new ValidaVinculoDoClienteComOConvenioDTO(clienteSemConvenio);
        ValidaVinculoDoClienteComOConvenioDTO.RetornoDTO retorno = processador.processar(validacao);
        Boolean possuiVinculoValido = retorno.getPossuiVinculoValido();
        Assertions.assertEquals(possuiVinculoValido, false, "Vínculo de convênio deve ser inválido quando inexistente");
    }

    @Test
    public void clienteConvenioInativo() throws BPLogicException {
        ClienteEntity clienteComConvenioInativo = ClienteBuilder.comStiuacaoDeConvenio(SituacaoConvenioEnum.INATIVO);
        ValidaVinculoDoClienteComOConvenioDTO validacao = new ValidaVinculoDoClienteComOConvenioDTO(clienteComConvenioInativo);
        ValidaVinculoDoClienteComOConvenioDTO.RetornoDTO retorno = processador.processar(validacao);
        Boolean possuiVinculoValido = retorno.getPossuiVinculoValido();
        Assertions.assertEquals(possuiVinculoValido, false, "Vínculo de convênio deve ser inválido quando inativo");

    }

    @Test
    public void clienteConvenioAtivo() throws BPLogicException {
        Cliente clienteComConvenioAtivo = ClienteBuilder.comStiuacaoDeConvenio(SituacaoConvenioEnum.ATIVO);
        ValidaVinculoDoClienteComOConvenioDTO validacao = new ValidaVinculoDoClienteComOConvenioDTO(clienteComConvenioAtivo);
        ValidaVinculoDoClienteComOConvenioDTO.RetornoDTO retorno = processador.processar(validacao);
        Boolean possuiVinculoValido = retorno.getPossuiVinculoValido();
        Assertions.assertEquals(possuiVinculoValido, true, "Vínculo de convênio deve ser válido quando ativo");
    }

}
