package test;

import architecture.transporte.pattern.AbstractDTO;
import architecture.transporte.pattern.DTO;
import domain.ClienteEntity;

public class ValidaVinculoDoClienteComOConvenioDTO extends AbstractDTO {

    private ClienteEntity cliente;

    public ValidaVinculoDoClienteComOConvenioDTO(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public static class RetornoDTO implements DTO {

        private Boolean possuiVinculoValido;
        private String motivoQuandoVinculoInvalido;

        public RetornoDTO(Boolean possuiVinculoValido, String motivoQuandoVinculoInvalido) {
            this.possuiVinculoValido = possuiVinculoValido;
            this.motivoQuandoVinculoInvalido = motivoQuandoVinculoInvalido;
        }

        public Boolean getPossuiVinculoValido() {
            return possuiVinculoValido;
        }

        public String getMotivoQuandoVinculoInvalido() {
            return motivoQuandoVinculoInvalido;
        }

    }
}
