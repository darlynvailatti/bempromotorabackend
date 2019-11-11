
package br.com.bempromotora.backend.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.bempromotora.backend.domain.parceiro.ParceiroEntity;

@Repository
public interface IParceiroRepository extends PagingAndSortingRepository<ParceiroEntity, Long> {
ParceiroEntity findFetchById(Long idParceiro);
	
	
}
