package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.proposta.regra.ModeloRegraPropostaEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IModeloRegraPropostaRepository extends PagingAndSortingRepository<ModeloRegraPropostaEntity, Long> {


}
