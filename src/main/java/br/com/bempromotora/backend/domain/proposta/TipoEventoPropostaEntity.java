package br.com.bempromotora.backend.domain.proposta;

import javax.persistence.*;

import br.com.bempromotora.backend.architecture.AbstractEntity;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "TipoEventoPropostaEntity")
@Data
public class TipoEventoPropostaEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idTipoEventoPropostaCredito_gen")
    @SequenceGenerator(name= "idTipoEventoPropostaCredito_gen", sequenceName="idTipoEventoPropostaCredito_seq", allocationSize =1)
    private Long id;

    private String descricao;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<TipoEventoSituacaoValidaPropostaCredito> situacoesValidas;

}
