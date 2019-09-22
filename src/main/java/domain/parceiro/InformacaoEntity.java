package domain.parceiro;

import architecture.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "Informacao")
public class InformacaoEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idInformacao_gen")
    @SequenceGenerator(name= "idInformacao_gen", sequenceName="idInformacao_seq", allocationSize =1)
    private Long id;

    @Override
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
