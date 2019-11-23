package br.com.bempromotora.backend;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EntityScan( basePackages = {
        "br.com.bempromotora.backend.domain.parceiro",
        "br.com.bempromotora.backend.domain.common",
        "br.com.bempromotora.backend.domain.proposta",
        "br.com.bempromotora.backend.domain.cliente",
        "br.com.bempromotora.backend.domain.chavevalor"})
@EnableAspectJAutoProxy
@EnableAsync
@EnableRabbit
public class BemPromotoraBackendApplication {

    private static final Logger log = LoggerFactory.getLogger(BemPromotoraBackendApplication.class);

    public static void main(String... args){
        log.info("Iniciando Backend Bem Promotora...");
        SpringApplication.run(BemPromotoraBackendApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper()
            .registerModule(new ParameterNamesModule())
            .registerModule(new Jdk8Module())
            .registerModule(new JavaTimeModule());
    }

}
