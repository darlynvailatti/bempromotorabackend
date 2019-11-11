package br.com.bempromotora.backend;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan( basePackages = {
        "br.com.bempromotora.backend.domain.parceiro",
        "br.com.bempromotora.backend.domain.common",
        "br.com.bempromotora.backend.domain.proposta",
        "br.com.bempromotora.backend.domain.cliente",
        "br.com.bempromotora.backend.domain.chavevalor"})
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


}
