package br.com.bempromotora.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.bempromotora.backend.domain.cliente.ClienteEntity;

@Repository
public interface IClienteRepository extends PagingAndSortingRepository<ClienteEntity, Long> {


	
}
