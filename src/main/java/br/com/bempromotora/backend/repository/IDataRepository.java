
package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.chavevalor.DataEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDataRepository extends PagingAndSortingRepository<DataEntity, Long> {


}
