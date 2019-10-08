
package repository;
import java.time.LocalDate;

import domain.chavevalor.LogEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILogRepository extends PagingAndSortingRepository<LogEntity, Long> {


	//@EntityGraph(attributePaths= {"permissao"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"informacao"}, type = @EntityGraph.EntityGraphType.LOAD)
	LogEntity findFetchById(Long idLog);
	
	Page<LogEntity> findFetchByPermissao(Long idPermissao, Pageable pageRequest);
	Page<LogEntity> findFetchByPermissaoInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<LogEntity> findFetchByDataHora(LocalDate dataHora, Pageable pageRequest);
	
	
	Page<LogEntity> findFetchByCodigoDaTransacao(String codigoDaTransacao, Pageable pageRequest);
	
	
	
}
