package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoDocumentoRepository extends PagingAndSortingRepository<TipoDocumento, Long> {


	TipoDocumento findFetchById(Long idTipoDocumento);
	
	Page<TipoDocumento> findFetchByDescricao(String descricao, Pageable pageRequest);

	
}
