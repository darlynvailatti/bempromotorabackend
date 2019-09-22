package repository;

import org.springframework.data.domain.Page;
import domain.DocumentoEntity;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IDocumentoRepository extends PagingAndSortingRepository<DocumentoEntity, Long> {

	DocumentoEntity findFetchById(Long idDocumento);
	
	Page<DocumentoEntity> findFetchByParceiro(Long idParceiro, Pageable pageRequest);

	Page<DocumentoEntity> findFetchByParceiroInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	Page<DocumentoEntity> findFetchByOrgaoEmissor(String orgaoEmissor, Pageable pageRequest);

	Page<DocumentoEntity> findFetchByData(Date data, Pageable pageRequest);
	
	Page<DocumentoEntity> findFetchByCodigoDocumento(String codigoDocumento, Pageable pageRequest);

}
