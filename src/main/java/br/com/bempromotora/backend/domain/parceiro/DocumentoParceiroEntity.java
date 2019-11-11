package br.com.bempromotora.backend.domain.parceiro;

import br.com.bempromotora.backend.domain.common.DocumentoEntity;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "DocumentoParceiroEntity")
@Data
public class DocumentoParceiroEntity extends br.com.bempromotora.backend.architecture.AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idDocumentoParceiro_gen")
    @SequenceGenerator(name= "idDocumentoParciero_gen", sequenceName="idDocumentoParceiro_seq", allocationSize =1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idParceiro")
    private ParceiroEntity parceiro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idDocumento")
    private DocumentoEntity documento;

    @Override
    public Long getId() {
        return this.id;
    }
}
