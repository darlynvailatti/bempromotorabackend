package br.com.bempromotora.backend.architecture.logic.processor.pattern;

import br.com.bempromotora.backend.architecture.exception.BusinessLogicException;

public interface IProcessor<In extends AbstractProcessorDTO,Out extends AbstractProcessorDTO> {

    Out execute(In in) throws BusinessLogicException;
}
