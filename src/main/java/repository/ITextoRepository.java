
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.TextoEntity;

@Repository
public interface ITextoRepository extends PagingAndSortingRepository<TextoEntity, Long> {


	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	TextoEntity findFetchById(Long idConteudo);
	
	Page<TextoEntity> findFetchByHashTextoComDiferencial(String hashTextoComDiferencial, Pageable pageRequest);
	
	
	Page<TextoEntity> findFetchByTexto(String texto, Pageable pageRequest);
	
	
	
}
