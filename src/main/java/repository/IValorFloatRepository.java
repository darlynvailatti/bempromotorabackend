
package repository;
import java.math.BigDecimal;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.ValorFloatEntity;

@Repository
public interface IValorFloatRepository extends PagingAndSortingRepository<ValorFloatEntity, Long> {


	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	ValorFloatEntity findFetchById(Long idConteudo);
	
	Page<ValorFloatEntity> findFetchByValorFloat(BigDecimal valorFloat, Pageable pageRequest);
	
	
	
}
