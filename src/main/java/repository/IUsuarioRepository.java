
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.UsuarioEntity;

@Repository
public interface IUsuarioRepository extends PagingAndSortingRepository<UsuarioEntity, Long> {


	//@EntityGraph(attributePaths= {"pessoasFisica"}, type = @EntityGraph.EntityGraphType.LOAD)
	UsuarioEntity findFetchById(Long idUsuario);
	
	Page<UsuarioEntity> findFetchBySenha(String senha, Pageable pageRequest);
	
	
	Page<UsuarioEntity> findFetchByAtivo(String ativo, Pageable pageRequest);
	
	
	
}
