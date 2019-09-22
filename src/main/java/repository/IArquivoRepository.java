
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.ArquivoEntity;

@Repository
public interface IArquivoRepository extends PagingAndSortingRepository<ArquivoEntity, Long> {


	//@EntityGraph(attributePaths= {"tiposDeArquivo"}, type = @EntityGraph.EntityGraphType.LOAD)
	ArquivoEntity findFetchById(Long idArquivo);
	
	Page<ArquivoEntity> findFetchByTiposDeArquivo(Long tipoArquivo, Pageable pageRequest);
	Page<ArquivoEntity> findFetchByTiposDeArquivoInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<ArquivoEntity> findFetchByImagemDeDocumento(byte[] imagemDeDocumento, Pageable pageRequest);
	
	
	
}
