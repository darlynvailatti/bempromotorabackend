package domain;

import common.Periodo;

import javax.persistence.*;

@Entity
@Table(name = "EnderecoEntity")
public class EnderecoEntity extends domain.AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idDocumento_gen")
    @SequenceGenerator(name= "idDocumento_gen", sequenceName="idDocumento_seq", allocationSize =1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idParceiro")
    private ParceiroEntity parceiro;

    private String logradouro;

    private String cep;

    private Periodo vigencia;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ParceiroEntity getParceiro() {
        return parceiro;
    }

    public void setParceiro(ParceiroEntity parceiro) {
        this.parceiro = parceiro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Periodo getVigencia() {
        return vigencia;
    }

    public void setVigencia(Periodo vigencia) {
        this.vigencia = vigencia;
    }
}
