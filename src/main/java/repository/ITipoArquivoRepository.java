package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import domain.TipoArquivoEntity;

@Repository
public interface ITipoArquivoRepository extends PagingAndSortingRepository<TipoArquivoEntity, Long> {

	TipoArquivoEntity findFetchById(Long idTipoArquivo);
	Page<TipoArquivoEntity> findFetchByTiposDocumento(Long idTipoDocumento, Pageable pageRequest);
	Page<TipoArquivoEntity> findFetchByTiposDocumentoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	Page<TipoArquivoEntity> findFetchByDescricao(String descricao, Pageable pageRequest);

}
