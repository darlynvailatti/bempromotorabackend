
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.BinarioEntity;

@Repository
public interface IBinarioRepository extends PagingAndSortingRepository<BinarioEntity, Long> {


	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	BinarioEntity findFetchById(Long idConteudo);
	
	Page<BinarioEntity> findFetchByHashBinarioComDiferencial(String hashBinarioComDiferencial, Pageable pageRequest);
	
	
	Page<BinarioEntity> findFetchByBinario(byte[] binario, Pageable pageRequest);
	
	
	
}
