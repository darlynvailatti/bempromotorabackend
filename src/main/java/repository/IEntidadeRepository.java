
package repository;
import domain.chavevalor.EntidadeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntidadeRepository extends PagingAndSortingRepository<EntidadeEntity, Long> {
EntidadeEntity findFetchById(Long idEntidade);
	
	Page<EntidadeEntity> findFetchByDescricao(String descricao, Pageable pageRequest);
	
	
	Page<EntidadeEntity> findFetchByQuantidadeDeRegistros(Integer quantidadeDeRegistros, Pageable pageRequest);
	
	
	
}
