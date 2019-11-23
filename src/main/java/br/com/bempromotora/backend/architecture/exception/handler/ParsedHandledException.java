package br.com.bempromotora.backend.architecture.exception.handler;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class ParsedHandledException {

    private String cause;

    private String message;

    private String stackTrace;

    private LocalDateTime dateTime;
}
