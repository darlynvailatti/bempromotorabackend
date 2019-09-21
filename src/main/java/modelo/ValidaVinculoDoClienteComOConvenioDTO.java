package modelo;

import arquitetura.transporte.AbstractDTO;
import arquitetura.transporte.DTO;

public class ValidaVinculoDoClienteComOConvenioDTO extends AbstractDTO {

    private Cliente cliente;

    public ValidaVinculoDoClienteComOConvenioDTO(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
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
