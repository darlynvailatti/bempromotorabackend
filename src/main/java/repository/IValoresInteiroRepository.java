
package repository;
import domain.chavevalor.ValoresInteiroEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IValoresInteiroRepository extends PagingAndSortingRepository<ValoresInteiroEntity, Long> {


	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	ValoresInteiroEntity findFetchById(Long idConteudo);
	
	Page<ValoresInteiroEntity> findFetchByValorInteiro(Integer valorInteiro, Pageable pageRequest);
	
	
	
}
