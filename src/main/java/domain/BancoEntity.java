package domain;

import javax.persistence.*;

@Entity
@Table(name = "BancoEntity")
public class BancoEntity extends architecture.AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idBanco_gen")
    @SequenceGenerator(name= "idBanco_gen", sequenceName="idBanco_seq", allocationSize =1)
    @Column(name = "idBanco", updatable = false, nullable = false)
    private Long id;

    private String nome;

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
}
