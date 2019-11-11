
package br.com.bempromotora.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.bempromotora.backend.domain.common.ArquivoEntity;

@Repository
public interface IArquivoRepository extends PagingAndSortingRepository<ArquivoEntity, Long> {



}
