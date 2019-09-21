package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

@Repository
public interface IPropostaRepository extends PagingAndSortingRepository<Proposta, Long> {

	Proposta findFetchById(Long idProposta);
	
	Page<Proposta> findFetchByModeloRegrasProposta(Long idModelodeRegra, Pageable pageRequest);
	Page<Proposta> findFetchByModeloRegrasPropostaInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	Page<Proposta> findFetchBySituacoesDaProposta(Long idSituacao, Pageable pageRequest);
	Page<Proposta> findFetchBySituacoesDaPropostaInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	Page<Proposta> findFetchByConvenio(Long idConvenio, Pageable pageRequest);
	Page<Proposta> findFetchByConvenioInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	Page<Proposta> findFetchByContrato(Long idContrato, Pageable pageRequest);
	Page<Proposta> findFetchByContratoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	Page<Proposta> findFetchByValor(BigDecimal valor, Pageable pageRequest);
	Page<Proposta> findFetchByData(Date data, Pageable pageRequest);
	Page<Proposta> findFetchByUsuario(Long idUsuario, Pageable pageRequest);
	Page<Proposta> findFetchByUsuarioInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	Page<Proposta> findFetchByProtocolodoConvenio(String protocolodoConvenio, Pageable pageRequest);
	Page<Proposta> findFetchByObservacao(String observacao, Pageable pageRequest);
	
}
