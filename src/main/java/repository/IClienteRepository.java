package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import domain.cliente.ClienteEntity;

import java.util.Date;

@Repository
public interface IClienteRepository extends PagingAndSortingRepository<ClienteEntity, Long> {

	ClienteEntity findFetchById(Long idCliente);

	Page<ClienteEntity> findFetchByNome(String nome, Pageable pageRequest);
	
	Page<ClienteEntity> findFetchByDataNascimento(Date dataNascimento, Pageable pageRequest);

	Page<ClienteEntity> findFetchByBloqueado(String bloqueado, Pageable pageRequest);
	
	
	
}
