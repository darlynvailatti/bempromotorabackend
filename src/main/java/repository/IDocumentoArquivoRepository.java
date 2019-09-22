package repository;

import domain.DocumentoArquivoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocumentoArquivoRepository extends PagingAndSortingRepository<DocumentoArquivoEntity, Long> {

	DocumentoArquivoEntity findFetchById(Long idArquivo);
	
	Page<DocumentoArquivoEntity> findFetchByDocumento(Long idDocumento, Pageable pageRequest);

	Page<DocumentoArquivoEntity> findFetchByDocumentoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);

}
