package domain;

import javax.persistence.*;


@Entity
@Table(name = "DocumentoParceiroEntity")
public class DocumentoParceiroEntity extends architecture.AbstractEntity {

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

    public void setId(Long id) {
        this.id = id;
    }

    public ParceiroEntity getParceiro() {
        return parceiro;
    }

    public void setParceiro(ParceiroEntity parceiro) {
        this.parceiro = parceiro;
    }

    public DocumentoEntity getDocumento() {
        return documento;
    }

    public void setDocumento(DocumentoEntity documento) {
        this.documento = documento;
    }
}
