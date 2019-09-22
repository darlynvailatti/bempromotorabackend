package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import domain.proposta.contrato.ContratoArquivoEntity;

@Repository
public interface IContratoArquivoRepository extends PagingAndSortingRepository<ContratoArquivoEntity, Long> {

	ContratoArquivoEntity findFetchById(Long idArquivo);
	
	Page<ContratoArquivoEntity> findFetchByContrato(Long idContrato, Pageable pageRequest);
	Page<ContratoArquivoEntity> findFetchByContratoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	
	
	
}
