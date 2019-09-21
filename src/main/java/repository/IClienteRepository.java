package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IClienteRepository extends PagingAndSortingRepository<Cliente, Long> {

	Cliente findFetchById(Long idCliente);

	Page<Cliente> findFetchByNome(String nome, Pageable pageRequest);
	
	Page<Cliente> findFetchByDataNascimento(Date dataNascimento, Pageable pageRequest);

	Page<Cliente> findFetchByBloqueado(String bloqueado, Pageable pageRequest);
	
	
	
}
