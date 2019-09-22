
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.RegistroEntity;

@Repository
public interface IRegistroRepository extends PagingAndSortingRepository<RegistroEntity, Long> {


	//@EntityGraph(attributePaths= {"entidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	RegistroEntity findFetchById(Long registroDeInformacao);
	
	Page<RegistroEntity> findFetchByEntidade(Long idEntidade, Pageable pageRequest);
	Page<RegistroEntity> findFetchByEntidadeInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	
}
