
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.proposta.PropostaArquivoEntity;

@Repository
public interface IPropostaArquivoRepository extends PagingAndSortingRepository<PropostaArquivoEntity, Long> {


	//@EntityGraph(attributePaths= {"proposta"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"arquivo"}, type = @EntityGraph.EntityGraphType.LOAD)
	PropostaArquivoEntity findFetchById(Long idArquivo);
	
	Page<PropostaArquivoEntity> findFetchByProposta(Long idProposta, Pageable pageRequest);
	Page<PropostaArquivoEntity> findFetchByPropostaInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	
}
