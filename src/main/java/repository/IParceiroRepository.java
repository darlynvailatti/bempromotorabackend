
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.parceiro.ParceiroEntity;

@Repository
public interface IParceiroRepository extends PagingAndSortingRepository<ParceiroEntity, Long> {
ParceiroEntity findFetchById(Long idParceiro);
	
	Page<ParceiroEntity> findFetchByApelido(String apelido, Pageable pageRequest);
	
	
	Page<ParceiroEntity> findFetchByAtivo(String ativo, Pageable pageRequest);
	
	
	
}
