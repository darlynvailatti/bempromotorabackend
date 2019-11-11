
package br.com.bempromotora.backend.repository;
import br.com.bempromotora.backend.domain.chavevalor.EntidadeEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntidadeRepository extends PagingAndSortingRepository<EntidadeEntity, Long> {

	
	
}
