
package repository;
import domain.chavevalor.PermissaoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPermissaoRepository extends PagingAndSortingRepository<PermissaoEntity, Long> {


	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"campoDeEntidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	PermissaoEntity findFetchById(Long idPermissao);
	
	Page<PermissaoEntity> findFetchByConteudo(Long idUsuario, Pageable pageRequest);
	Page<PermissaoEntity> findFetchByConteudoInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	
}
