package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.bempromotora.backend.domain.cliente.ConvenioClienteEntity;
@Repository
public interface IConvenioClienteRepository extends PagingAndSortingRepository<ConvenioClienteEntity, Long> {

	ConvenioClienteEntity findByCliente(ClienteEntity clienteEntity);
	
}
