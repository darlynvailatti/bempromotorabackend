
package br.com.bempromotora.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.bempromotora.backend.domain.parceiro.LocalidadeEntity;

@Repository
public interface ILocalidadeRepository extends PagingAndSortingRepository<LocalidadeEntity, Long> {


}
