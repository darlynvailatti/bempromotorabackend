
package br.com.bempromotora.backend.repository;
import br.com.bempromotora.backend.domain.chavevalor.PermissaoEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPermissaoRepository extends PagingAndSortingRepository<PermissaoEntity, Long> {

	
}
