package architecture.logic.processor.pattern;

import architecture.exception.BusinessLogicException;

public interface IProcessor<In extends AbstractProcessorDTO,Out extends AbstractProcessorDTO> {

    Out execute(In in) throws BusinessLogicException;
}
