
package repository;
import domain.chavevalor.AliasEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAliasRepository extends PagingAndSortingRepository<AliasEntity, Long> {


	//@EntityGraph(attributePaths= {"valoresDeOpcao"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"opcaoDeCampo"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"campoDeEntidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	AliasEntity findFetchById(Long idAlias);
	
	Page<AliasEntity> findFetchByValoresDeOpcao(Long idConteudo, Pageable pageRequest);
	Page<AliasEntity> findFetchByValoresDeOpcaoInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<AliasEntity> findFetchByOpcaoDeCampo(Long idOpcao, Pageable pageRequest);
	Page<AliasEntity> findFetchByOpcaoDeCampoInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<AliasEntity> findFetchByNomeResumido(String nomeResumido, Pageable pageRequest);
	
	
	
}
