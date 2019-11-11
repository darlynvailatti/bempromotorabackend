
package br.com.bempromotora.backend.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.bempromotora.backend.domain.parceiro.CidadeEntity;

@Repository
public interface ICidadeRepository extends PagingAndSortingRepository<CidadeEntity, Long> {
	
}
