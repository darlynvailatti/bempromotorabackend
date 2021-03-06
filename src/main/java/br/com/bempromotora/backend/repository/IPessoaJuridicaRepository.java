
package br.com.bempromotora.backend.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.bempromotora.backend.domain.parceiro.PessoaJuridicaEntity;

@Repository
public interface IPessoaJuridicaRepository extends PagingAndSortingRepository<PessoaJuridicaEntity, Long> {

	
}
