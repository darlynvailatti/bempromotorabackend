
package br.com.bempromotora.backend.repository;
import br.com.bempromotora.backend.domain.chavevalor.HashSenhaEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IHashSenhaRepository extends PagingAndSortingRepository<HashSenhaEntity, Long> {


}
