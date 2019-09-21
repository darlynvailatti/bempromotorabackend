package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoArquivoRepository extends PagingAndSortingRepository<TipoArquivo, Long> {

	TipoArquivo findFetchById(Long idTipoArquivo);
	Page<TipoArquivo> findFetchByTiposDocumento(Long idTipoDocumento, Pageable pageRequest);
	Page<TipoArquivo> findFetchByTiposDocumentoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	Page<TipoArquivo> findFetchByDescricao(String descricao, Pageable pageRequest);

}
