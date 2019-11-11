
package br.com.bempromotora.backend.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.bempromotora.backend.domain.common.UsuarioEntity;

@Repository
public interface IUsuarioRepository extends PagingAndSortingRepository<UsuarioEntity, Long> {
	
	
}
