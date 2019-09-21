package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IDocumentoRepository extends PagingAndSortingRepository<Documento, Long> {

	Documento findFetchById(Long idDocumento);
	
	Page<Documento> findFetchByParceiro(Long idParceiro, Pageable pageRequest);

	Page<Documento> findFetchByParceiroInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	Page<Documento> findFetchByOrgaoEmissor(String orgaoEmissor, Pageable pageRequest);

	Page<Documento> findFetchByData(Date data, Pageable pageRequest);
	
	Page<Documento> findFetchByCodigoDocumento(String codigoDocumento, Pageable pageRequest);

}
