package repository;

import domain.SituacaoProposta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISituacaoPropostaRepository extends PagingAndSortingRepository<SituacaoProposta, Long> {

	SituacaoProposta findFetchById(Long idSituacao);
	
	Page<SituacaoProposta> findFetchByDescricao(String descricao, Pageable pageRequest);

}
