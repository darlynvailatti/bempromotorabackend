package domain.proposta.regra.validador;

import architecture.exception.BusinessLogicException;
import domain.chavevalor.CampoDeEntidadeEntity;
import domain.proposta.PropostaEntity;
import domain.proposta.regra.RegraEntity;

public interface IValidadorRegraProposta {

    boolean aceitaValidar(RegraEntity regra);

    void validar(RegraEntity regra, PropostaEntity proposta) throws Exception;

}
