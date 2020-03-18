package br.com.bempromotora.backend.service.dto;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessorDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateClienteRequest extends AbstractProcessorDTO {

    private String nome;

    private String cpf;

    private LocalDate dataNascimento;

    private Long idConvenio;

    private LocalDate dataEntradaConvenio;

    private String matriculaConvenio;
}
