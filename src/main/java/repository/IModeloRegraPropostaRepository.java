package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import domain.proposta.regra.ModeloRegraPropostaEntity;

import java.util.Date;

@Repository
public interface IModeloRegraPropostaRepository extends PagingAndSortingRepository<ModeloRegraPropostaEntity, Long> {

	ModeloRegraPropostaEntity findFetchById(Long idModeloDeRegra);
	
	Page<ModeloRegraPropostaEntity> findFetchByDescricao(String descricao, Pageable pageRequest);

	Page<ModeloRegraPropostaEntity> findFetchByDataInicioVigencia(Date dataInicioVigencia, Pageable pageRequest);
	
	Page<ModeloRegraPropostaEntity> findFetchByDataFimVigencia(Date dataFimVigencia, Pageable pageRequest);
	
}
