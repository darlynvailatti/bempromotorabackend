
package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.chavevalor.ValorFloatEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IValorFloatRepository extends PagingAndSortingRepository<ValorFloatEntity, Long> {
	
}
