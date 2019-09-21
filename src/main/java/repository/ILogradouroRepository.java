package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILogradouroRepository extends PagingAndSortingRepository<Logradouro, Long> {

	Logradouro findFetchById(Long idLogradouro);
	
	Page<Logradouro> findFetchByLocalidade(Long idLocalidade, Pageable pageRequest);

	Page<Logradouro> findFetchByLocalidadeInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	Page<Logradouro> findFetchByEndereco(String endereco, Pageable pageRequest);

	Page<Logradouro> findFetchByNumero(String numero, Pageable pageRequest);
	
	Page<Logradouro> findFetchByComplemento(String complemento, Pageable pageRequest);
	
	Page<Logradouro> findFetchByBairro(String bairro, Pageable pageRequest);
	
	Page<Logradouro> findFetchByCEP(String cEP, Pageable pageRequest);
	
	
	
}
