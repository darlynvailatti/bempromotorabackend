package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IModeloRegraPropostaRepository extends PagingAndSortingRepository<ModeloRegraProposta, Long> {

	ModeloRegraProposta findFetchById(Long idModeloDeRegra);
	
	Page<ModeloRegraProposta> findFetchByDescricao(String descricao, Pageable pageRequest);

	Page<ModeloRegraProposta> findFetchByDataInicioVigencia(Date dataInicioVigencia, Pageable pageRequest);
	
	Page<ModeloRegraProposta> findFetchByDataFimVigencia(Date dataFimVigencia, Pageable pageRequest);
	
}
