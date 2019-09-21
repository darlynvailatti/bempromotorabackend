package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.sql.Blob;
import java.util.Date;

@Repository
public interface IVersaoContratoRepository extends PagingAndSortingRepository<VersaoContrato, Long> {

	VersaoContrato findFetchById(Long versaoModelo);
	Page<VersaoContrato> findFetchByModelosContrato(Long modelodeContrato, Pageable pageRequest);
	Page<VersaoContrato> findFetchByModelosContratoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	Page<VersaoContrato> findFetchByTextoInicial(Blob textoInicial, Pageable pageRequest);
	Page<VersaoContrato> findFetchByTextoFinal(Blob textoFinal, Pageable pageRequest);
	Page<VersaoContrato> findFetchByDataIniVigencia(Date dataIniVigencia, Pageable pageRequest);
	Page<VersaoContrato> findFetchByDataFimVigencial(Date dataFimVigencial, Pageable pageRequest);

}
