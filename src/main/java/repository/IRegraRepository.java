
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.proposta.regra.RegraEntity;

@Repository
public interface IRegraRepository extends PagingAndSortingRepository<RegraEntity, Long> {


	//@EntityGraph(attributePaths= {"modeloRegrasProposta"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"informacao"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"campoDeEntidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	RegraEntity findFetchById(Long idRegra);
	
	Page<RegraEntity> findFetchByModeloRegrasProposta(Long idModelodeRegra, Pageable pageRequest);
	Page<RegraEntity> findFetchByModeloRegrasPropostaInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<RegraEntity> findFetchByDescricao(String descricao, Pageable pageRequest);
	
	
	Page<RegraEntity> findFetchByOperadorComparacao(String operadorComparacao, Pageable pageRequest);
	
	
	Page<RegraEntity> findFetchByInformacao(Long idInformacaoComparacao, Pageable pageRequest);
	Page<RegraEntity> findFetchByInformacaoInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	
}
