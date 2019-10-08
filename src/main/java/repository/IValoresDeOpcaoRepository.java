
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IValoresDeOpcaoRepository extends PagingAndSortingRepository<Override, Long> {


	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
//	ValorDeOpcaoEntity findFetchById(Long idConteudo);
	
//	Page<ValoresDeOpcaoEntity> findFetchByValorDeOpcao(String valorDeOpcao, Pageable pageRequest);
	
	
	
}
