package br.com.bempromotora.backend.service.impl;

import br.com.bempromotora.backend.architecture.exception.handler.ExceptionHandler;
import br.com.bempromotora.backend.service.ExceptionHandlerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExceptionHandlerServiceImpl implements ExceptionHandlerService {

    @Autowired
    private ExceptionHandler exceptionHandler;


    @Override
    public void handle(Exception e) {
        log.info("Handling exception in service layer. Delegating to implementation...");
        exceptionHandler.handle(e);
    }
}
