
package br.com.bempromotora.backend.repository;
import br.com.bempromotora.backend.domain.chavevalor.OpcaoCampoEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOpcaoDeCampoRepository extends PagingAndSortingRepository<OpcaoCampoEntity, Long> {

}
