package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IEvolucaoPropostaRepository extends PagingAndSortingRepository<EvolucaoProposta, Long> {

	EvolucaoProposta findFetchById(Long idEvolucaoProposta);
	
	Page<EvolucaoProposta> findFetchByUsuario(Long idUsuario, Pageable pageRequest);
	Page<EvolucaoProposta> findFetchByUsuarioInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	Page<EvolucaoProposta> findFetchByNotificacao(Long idNotificacao, Pageable pageRequest);
	Page<EvolucaoProposta> findFetchByNotificacaoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	Page<EvolucaoProposta> findFetchBySituacoesDaProposta(Long idSituacao, Pageable pageRequest);
	Page<EvolucaoProposta> findFetchBySituacoesDaPropostaInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	Page<EvolucaoProposta> findFetchByDataHora(Date dataHora, Pageable pageRequest);

}
