
package br.com.bempromotora.backend.repository;
import br.com.bempromotora.backend.domain.chavevalor.ValoresInteiroEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IValoresInteiroRepository extends PagingAndSortingRepository<ValoresInteiroEntity, Long> {

}
