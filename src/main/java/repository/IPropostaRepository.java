
package repository;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.proposta.PropostaEntity;

@Repository
public interface IPropostaRepository extends PagingAndSortingRepository<PropostaEntity, Long> {


	//@EntityGraph(attributePaths= {"modeloRegrasProposta"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"situacoesDaProposta"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"convenio"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"contrato"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"usuario"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"cliente"}, type = @EntityGraph.EntityGraphType.LOAD)
	PropostaEntity findFetchById(Long idProposta);
	
	Page<PropostaEntity> findFetchByModeloRegrasProposta(Long idModelodeRegra, Pageable pageRequest);
	Page<PropostaEntity> findFetchByModeloRegrasPropostaInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<PropostaEntity> findFetchBySituacoesDaProposta(Long idSituacao, Pageable pageRequest);
	Page<PropostaEntity> findFetchBySituacoesDaPropostaInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<PropostaEntity> findFetchByConvenio(Long idConvenio, Pageable pageRequest);
	Page<PropostaEntity> findFetchByConvenioInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<PropostaEntity> findFetchByContrato(Long idContrato, Pageable pageRequest);
	Page<PropostaEntity> findFetchByContratoInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<PropostaEntity> findFetchByValor(BigDecimal valor, Pageable pageRequest);
	
	
	Page<PropostaEntity> findFetchByData(LocalDate data, Pageable pageRequest);
	
	
	Page<PropostaEntity> findFetchByUsuario(Long idUsuario, Pageable pageRequest);
	Page<PropostaEntity> findFetchByUsuarioInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<PropostaEntity> findFetchByProtocolodoConvenio(String protocolodoConvenio, Pageable pageRequest);
	
	
	Page<PropostaEntity> findFetchByObservacao(String observacao, Pageable pageRequest);
	
	
	
}
