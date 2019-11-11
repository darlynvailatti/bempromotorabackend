
package br.com.bempromotora.backend.repository;
import br.com.bempromotora.backend.domain.chavevalor.RegistroEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegistroRepository extends PagingAndSortingRepository<RegistroEntity, Long> {
	
}
