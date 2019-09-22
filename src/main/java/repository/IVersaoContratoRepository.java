package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import domain.proposta.contrato.VersaoContratoEntity;

import java.sql.Blob;
import java.util.Date;

@Repository
public interface IVersaoContratoRepository extends PagingAndSortingRepository<VersaoContratoEntity, Long> {

	VersaoContratoEntity findFetchById(Long versaoModelo);
	Page<VersaoContratoEntity> findFetchByModelosContrato(Long modelodeContrato, Pageable pageRequest);
	Page<VersaoContratoEntity> findFetchByModelosContratoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	Page<VersaoContratoEntity> findFetchByTextoInicial(Blob textoInicial, Pageable pageRequest);
	Page<VersaoContratoEntity> findFetchByTextoFinal(Blob textoFinal, Pageable pageRequest);
	Page<VersaoContratoEntity> findFetchByDataIniVigencia(Date dataIniVigencia, Pageable pageRequest);
	Page<VersaoContratoEntity> findFetchByDataFimVigencial(Date dataFimVigencial, Pageable pageRequest);

}
