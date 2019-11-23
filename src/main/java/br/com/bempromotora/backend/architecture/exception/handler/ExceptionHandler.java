package br.com.bempromotora.backend.architecture.exception.handler;

import br.com.bempromotora.backend.architecture.util.ExpectThat;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

@Component
@Slf4j
public class ExceptionHandler {

    private final String QUEUE = "handled-exception";

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue defaultQueue;

    private Exception exception;

    private String parsedException;

    @Autowired
    private ObjectMapper objectMapper;

    public void handle(Exception e){
        log.info("Hanling excpetion");
        this.exception = e;
        parse();
        sendToBroker();
    }

    private void parse(){
        try {
            String cause = "";
            if(ExpectThat.isNotNull(exception.getCause())) {
                cause = exception.getCause().toString();
            }
            String message = exception.getMessage();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            exception.printStackTrace(new PrintStream(out));
            String stackTrace = new String(out.toByteArray());

            ParsedHandledException handledException = ParsedHandledException.builder()
                    .dateTime(LocalDateTime.now())
                    .cause(cause)
                    .message(message)
                    .stackTrace(stackTrace)
                    .build();
            try {
                parsedException = objectMapper.writeValueAsString(handledException);
            }catch (Exception e){
                log.error("Error on parse object to string. Message: {}", e.getMessage());
            }
            log.info(parsedException);
        }catch (Exception e){
            log.error("Error on parse");
        }

    }

    private void sendToBroker(){
        rabbitTemplate.convertAndSend(defaultQueue.getName(), parsedException);
    }

    @Bean
    public Queue getExceptionHandlerQueue(){
        return new Queue(QUEUE);
    }

}
