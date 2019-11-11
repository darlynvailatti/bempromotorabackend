
package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.chavevalor.EstruturaDeRegistroEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEstruturaDeRegistroRepository extends PagingAndSortingRepository<EstruturaDeRegistroEntity, Long> {


}
