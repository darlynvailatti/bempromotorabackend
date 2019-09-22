
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.parceiro.CidadeEntity;

@Repository
public interface ICidadeRepository extends PagingAndSortingRepository<CidadeEntity, Long> {
CidadeEntity findFetchById(Long idCidade);
	
	Page<CidadeEntity> findFetchByDescricao(String descricao, Pageable pageRequest);
	
	
	Page<CidadeEntity> findFetchByUF(String uF, Pageable pageRequest);
	
	
	Page<CidadeEntity> findFetchByPais(String pais, Pageable pageRequest);
	
	
	
}
