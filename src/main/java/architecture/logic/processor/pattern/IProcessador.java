package architecture.logic.processor.pattern;

import architecture.BPLogicException;
import architecture.transporte.pattern.DTO;

public interface IProcessador<Entrada extends DTO, Saida extends DTO> {

     Saida processar(Entrada entrada) throws BPLogicException;

     boolean aceita(Entrada entrada);
}
