package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.proposta.contrato.ContratoEntity;
@Repository
public interface IContratoRepository extends PagingAndSortingRepository<ContratoEntity, Long> {

	ContratoEntity findFetchById(Long idContrato);
	
	Page<ContratoEntity> findFetchByVersoesContrato(Long idVersao, Pageable pageRequest);

	Page<ContratoEntity> findFetchByVersoesContratoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	
	
	
}
