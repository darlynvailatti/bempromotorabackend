
package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.chavevalor.LogEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILogRepository extends PagingAndSortingRepository<LogEntity, Long> {



}
