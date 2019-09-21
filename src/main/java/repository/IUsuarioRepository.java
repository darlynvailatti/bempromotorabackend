package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {

	Usuario findFetchById(Long idUsuario);
	
	Page<Usuario> findFetchBySenha(String senha, Pageable pageRequest);
	
	Page<Usuario> findFetchByAtivo(String ativo, Pageable pageRequest);

	
	
}
