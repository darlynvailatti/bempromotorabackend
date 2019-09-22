
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.ValoresInteiroEntity;

@Repository
public interface IValoresInteiroRepository extends PagingAndSortingRepository<ValoresInteiroEntity, Long> {


	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	ValoresInteiroEntity findFetchById(Long idConteudo);
	
	Page<ValoresInteiroEntity> findFetchByValorInteiro(Integer valorInteiro, Pageable pageRequest);
	
	
	
}
