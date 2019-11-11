package br.com.bempromotora.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.bempromotora.backend.domain.common.TipoDocumentoEntity;

@Repository
public interface ITipoDocumentoRepository extends PagingAndSortingRepository<TipoDocumentoEntity, Long> {

	
}
