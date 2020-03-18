package br.com.bempromotora.backend.rest.dto.cliente;

import br.com.bempromotora.backend.architecture.transporte.pattern.AbstractDTO;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class CreateClienteRequestDTO extends AbstractDTO {

    @NotBlank
    private String nome;

    @NotNull
    private LocalDate dataNascimento;

    @NotBlank
    private String cpf;

    @NotNull
    private Long idConvenio;

    @NotNull
    private LocalDate dataEntradaConvenio;

    @NotNull
    private String matriculaConvenio;

}
