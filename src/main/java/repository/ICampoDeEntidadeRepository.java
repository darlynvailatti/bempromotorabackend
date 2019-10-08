
package repository;
import domain.chavevalor.CampoDeEntidadeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICampoDeEntidadeRepository extends PagingAndSortingRepository<CampoDeEntidadeEntity, Long> {


	//@EntityGraph(attributePaths= {"conteudo"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"campoDeEntidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"entidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	CampoDeEntidadeEntity findFetchById(Long idCampo);
	
	Page<CampoDeEntidadeEntity> findFetchByEntidade(Long idEntidade, Pageable pageRequest);
	Page<CampoDeEntidadeEntity> findFetchByEntidadeInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<CampoDeEntidadeEntity> findFetchByDescricao(String descricao, Pageable pageRequest);
	
	
	Page<CampoDeEntidadeEntity> findFetchByTamanhoMaximoInteiro(Integer tamanhoMaximoInteiro, Pageable pageRequest);
	
	
	Page<CampoDeEntidadeEntity> findFetchByTamanoMinimoInteiro(Integer tamanoMinimoInteiro, Pageable pageRequest);
	
	
	Page<CampoDeEntidadeEntity> findFetchByTamanhoCasasDecimais(Integer tamanhoCasasDecimais, Pageable pageRequest);
	
	
	Page<CampoDeEntidadeEntity> findFetchByAceitaNuloSN(String aceitaNuloSN, Pageable pageRequest);
	
	
	Page<CampoDeEntidadeEntity> findFetchByAutoIncrementoSN(String autoIncrementoSN, Pageable pageRequest);
	
	
	Page<CampoDeEntidadeEntity> findFetchByCampoDeEntidade(Long idCampoChaveExtrangeira, Pageable pageRequest);
	Page<CampoDeEntidadeEntity> findFetchByCampoDeEntidadeInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<CampoDeEntidadeEntity> findFetchByConteudo(Long idConteudoDefault, Pageable pageRequest);
	Page<CampoDeEntidadeEntity> findFetchByConteudoInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	
}
