
package repository;
import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.EstruturaDeRegistroEntity;

@Repository
public interface IEstruturaDeRegistroRepository extends PagingAndSortingRepository<EstruturaDeRegistroEntity, Long> {


	//@EntityGraph(attributePaths= {"campoDeEntidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"estruturaDeRegistro"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"campoDeEntidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"entidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	EstruturaDeRegistroEntity findFetchById(Long idEstrutura);
	
	Page<EstruturaDeRegistroEntity> findFetchByEntidade(Long entidade, Pageable pageRequest);
	Page<EstruturaDeRegistroEntity> findFetchByEntidadeInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<EstruturaDeRegistroEntity> findFetchByCampoDeEntidade(Long campo, Pageable pageRequest);
	Page<EstruturaDeRegistroEntity> findFetchByCampoDeEntidadeInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<EstruturaDeRegistroEntity> findFetchByDataInicio(LocalDate dataInicio, Pageable pageRequest);
	
	
	Page<EstruturaDeRegistroEntity> findFetchByDataFimVigencia(LocalDate dataFimVigencia, Pageable pageRequest);
	
	
	Page<EstruturaDeRegistroEntity> findFetchByEstruturaDeRegistro(Long idEstruturaPai, Pageable pageRequest);
	Page<EstruturaDeRegistroEntity> findFetchByEstruturaDeRegistroInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<EstruturaDeRegistroEntity> findFetchByCampoDeEntidadePosVigencia(Long idCampoPosVigencia, Pageable pageRequest);
	Page<EstruturaDeRegistroEntity> findFetchByCampoDeEntidadePosVigenciaInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<EstruturaDeRegistroEntity> findFetchByCriarLogSN(String criarLogSN, Pageable pageRequest);
	
	
	
}
