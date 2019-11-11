
package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.chavevalor.CampoDeEntidadeEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICampoDeEntidadeRepository extends PagingAndSortingRepository<CampoDeEntidadeEntity, Long> {


}
