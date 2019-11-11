package br.com.bempromotora.backend.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.bempromotora.backend.domain.common.TipoArquivoEntity;

@Repository
public interface ITipoArquivoRepository extends PagingAndSortingRepository<TipoArquivoEntity, Long> {


}
