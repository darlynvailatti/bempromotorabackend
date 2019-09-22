package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import domain.TipoDocumentoEntity;

@Repository
public interface ITipoDocumentoRepository extends PagingAndSortingRepository<TipoDocumentoEntity, Long> {


	TipoDocumentoEntity findFetchById(Long idTipoDocumento);
	
	Page<TipoDocumentoEntity> findFetchByDescricao(String descricao, Pageable pageRequest);

	
}
