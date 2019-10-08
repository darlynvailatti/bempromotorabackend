
package repository;
import domain.chavevalor.InformacaoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IInformacaoRepository extends PagingAndSortingRepository<InformacaoEntity, Long> {


	//@EntityGraph(attributePaths= {"estruturaDeRegistro"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"registro"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	InformacaoEntity findFetchById(Long idInformacao);
	
	Page<InformacaoEntity> findFetchByEstruturaDeRegistro(Long idEstrutura, Pageable pageRequest);
	Page<InformacaoEntity> findFetchByEstruturaDeRegistroInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<InformacaoEntity> findFetchByRegistro(Long idRegistroDeInformacao, Pageable pageRequest);
	Page<InformacaoEntity> findFetchByRegistroInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	
}
