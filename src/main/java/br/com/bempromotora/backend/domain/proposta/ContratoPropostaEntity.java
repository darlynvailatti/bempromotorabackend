package br.com.bempromotora.backend.domain.proposta;

import br.com.bempromotora.backend.common.Data;
import br.com.bempromotora.backend.domain.common.ArquivoEntity;

import javax.persistence.*;

import br.com.bempromotora.backend.architecture.AbstractEntity;

@Entity
@Table(name = "ContratoPropostaEntity")
@lombok.Data
public class ContratoPropostaEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idContratoProposta_gen")
    @SequenceGenerator(name= "idContratoProposta_gen", sequenceName="idContratoProposta_seq", allocationSize =1)
    @Column(name = "idContratoProposta", updatable = false, nullable = false)
    private Long id;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "conteudo", column = @Column(name = "DATA_EMISSAO"))
    })
    private Data emissao;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "conteudo", column = @Column(name = "DATA_VALIDADE"))
    })
    private Data validade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idArquivo")
    private ArquivoEntity arquivo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idProposta")
    private PropostaEntity proposta;

}
