
package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.chavevalor.AliasEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAliasRepository extends PagingAndSortingRepository<AliasEntity, Long> {

}
