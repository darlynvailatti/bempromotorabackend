
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.ValoresDeOpcaoEntity;

@Repository
public interface IValoresDeOpcaoRepository extends PagingAndSortingRepository<ValoresDeOpcaoEntity, Long> {


	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	ValoresDeOpcaoEntity findFetchById(Long idConteudo);
	
	Page<ValoresDeOpcaoEntity> findFetchByValorDeOpcao(String valorDeOpcao, Pageable pageRequest);
	
	
	
}
