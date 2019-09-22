
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.OpcaoDeCampoEntity;

@Repository
public interface IOpcaoDeCampoRepository extends PagingAndSortingRepository<OpcaoDeCampoEntity, Long> {


	//@EntityGraph(attributePaths= {"campoDeEntidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	OpcaoDeCampoEntity findFetchById(Long idOpcao);
	
	Page<OpcaoDeCampoEntity> findFetchByCampoDeEntidade(Long idCampo, Pageable pageRequest);
	Page<OpcaoDeCampoEntity> findFetchByCampoDeEntidadeInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<OpcaoDeCampoEntity> findFetchByNomeLogico(String nomeLogico, Pageable pageRequest);
	
	
	
}
