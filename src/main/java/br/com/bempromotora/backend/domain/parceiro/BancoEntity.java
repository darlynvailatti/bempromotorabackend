package br.com.bempromotora.backend.domain.parceiro;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "BancoEntity")
@Data
public class BancoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idBanco_gen")
    @SequenceGenerator(name= "idBanco_gen", sequenceName="idBanco_seq", allocationSize =1)
    @Column(name = "idBanco", updatable = false, nullable = false)
    private Long id;

    private String nome;
}
