
package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.chavevalor.InformacaoEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IInformacaoRepository extends PagingAndSortingRepository<InformacaoEntity, Long> {



}
