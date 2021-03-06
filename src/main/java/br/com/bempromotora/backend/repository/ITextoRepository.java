
package br.com.bempromotora.backend.repository;
import br.com.bempromotora.backend.domain.chavevalor.TextoEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITextoRepository extends PagingAndSortingRepository<TextoEntity, Long> {

}
