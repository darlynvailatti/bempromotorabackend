package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import domain.proposta.SituacaoPropostaEntity;

@Repository
public interface ISituacaoPropostaRepository extends PagingAndSortingRepository<SituacaoPropostaEntity, Long> {

	SituacaoPropostaEntity findFetchById(Long idSituacao);
	
	Page<SituacaoPropostaEntity> findFetchByDescricao(String descricao, Pageable pageRequest);

}
