
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.parceiro.LocalidadeEntity;

@Repository
public interface ILocalidadeRepository extends PagingAndSortingRepository<LocalidadeEntity, Long> {


	//@EntityGraph(attributePaths= {"informacaoBancaria"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"parceiro"}, type = @EntityGraph.EntityGraphType.LOAD)
	LocalidadeEntity findFetchById(Long idLocalidade);
	
	Page<LocalidadeEntity> findFetchByDescricao(String descricao, Pageable pageRequest);
	
	
	Page<LocalidadeEntity> findFetchByParceiro(Long idParceiro, Pageable pageRequest);
	Page<LocalidadeEntity> findFetchByParceiroInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<LocalidadeEntity> findFetchByResidencialouComercial(String residencialouComercial, Pageable pageRequest);
	
	
	Page<LocalidadeEntity> findFetchByInformacaoBancaria(Long idInformacaoBancaria, Pageable pageRequest);
	Page<LocalidadeEntity> findFetchByInformacaoBancariaInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	
}
