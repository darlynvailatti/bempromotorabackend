
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.HashSenhaEntity;

@Repository
public interface IHashSenhaRepository extends PagingAndSortingRepository<HashSenhaEntity, Long> {


	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	HashSenhaEntity findFetchById(Long idConteudo);
	
	Page<HashSenhaEntity> findFetchByHashSenhas(String hashSenhas, Pageable pageRequest);
	
	
	
}
