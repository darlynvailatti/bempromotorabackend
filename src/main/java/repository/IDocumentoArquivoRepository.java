package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocumentoArquivoRepository extends PagingAndSortingRepository<DocumentoArquivo, Long> {

	DocumentoArquivo findFetchById(Long idArquivo);
	
	Page<DocumentoArquivo> findFetchByDocumento(Long idDocumento, Pageable pageRequest);

	Page<DocumentoArquivo> findFetchByDocumentoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);

}
