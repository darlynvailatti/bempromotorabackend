
package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.chavevalor.BinarioEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IBinarioRepository extends PagingAndSortingRepository<BinarioEntity, Long> {

}
