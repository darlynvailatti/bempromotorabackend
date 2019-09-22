
package repository;
import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.DataEntity;

@Repository
public interface IDataRepository extends PagingAndSortingRepository<DataEntity, Long> {


	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	DataEntity findFetchById(Long idConteudo);
	
	Page<DataEntity> findFetchByDataHora(LocalDate dataHora, Pageable pageRequest);
	
	
	
}
