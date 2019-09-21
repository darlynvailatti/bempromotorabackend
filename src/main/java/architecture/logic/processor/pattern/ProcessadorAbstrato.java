package architecture.logic.processor.pattern;

import architecture.BPLogicException;
import architecture.logic.processor.pattern.IProcessador;
import architecture.transporte.pattern.DTO;

public abstract class ProcessadorAbstrato<Entrada extends DTO, Saida extends DTO> implements IProcessador<Entrada, Saida> {


    @Override
    public Saida processar(Entrada entrada) throws BPLogicException {
        return execucao(entrada);
    }

    protected abstract Saida execucao(Entrada entrada) throws BPLogicException;

}
