package domain.regravalidacao;

import javax.persistence.*;

import architecture.AbstractEntity;

@Entity
@Table(name = "AtributoPropostaEntity")
public class AtributoPropostaEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idAtributoPropostaCredito_gen")
    @SequenceGenerator(name= "idAtributoPropostaCredito_gen", sequenceName="idAtributoPropostaCredito_seq", allocationSize =1)
    private Long id;

    private String nome;

    @Enumerated(EnumType.ORDINAL)
    private TipoAtrbituoPropostaEnum tipoAtributo;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAtrbituoPropostaEnum getTipoAtributo() {
        return tipoAtributo;
    }

    public void setTipoAtributo(TipoAtrbituoPropostaEnum tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
    }
}
