package br.com.bempromotora.backend.aop;

import br.com.bempromotora.backend.service.ExceptionHandlerService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
@Slf4j
public class ProcessorAspect {

    @Autowired
    private ExceptionHandlerService exceptionHandlerService;

    @AfterThrowing(
            value = "execution (* br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessor.execute(..))",
            throwing = "exception")
    public void afterProcessorThrowException(Exception exception) {
        log.info("Handling exception with AOP - After throw exception in processor.execute: {0}", exception);
        exceptionHandlerService.handle(exception);
    }

}
