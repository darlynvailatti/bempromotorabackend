package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.proposta.EvolucaoPropostaEntity;
import java.util.Date;

@Repository
public interface IEvolucaoPropostaRepository extends PagingAndSortingRepository<EvolucaoPropostaEntity, Long> {

	EvolucaoPropostaEntity findFetchById(Long idEvolucaoProposta);
	
	Page<EvolucaoPropostaEntity> findFetchByUsuario(Long idUsuario, Pageable pageRequest);
	Page<EvolucaoPropostaEntity> findFetchByUsuarioInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	Page<EvolucaoPropostaEntity> findFetchByNotificacao(Long idNotificacao, Pageable pageRequest);
	Page<EvolucaoPropostaEntity> findFetchByNotificacaoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	Page<EvolucaoPropostaEntity> findFetchBySituacoesDaProposta(Long idSituacao, Pageable pageRequest);
	Page<EvolucaoPropostaEntity> findFetchBySituacoesDaPropostaInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	Page<EvolucaoPropostaEntity> findFetchByDataHora(Date dataHora, Pageable pageRequest);

}
