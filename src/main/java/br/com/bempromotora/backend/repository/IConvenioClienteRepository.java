package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.bempromotora.backend.domain.cliente.ConvenioClienteEntity;
@Repository
public interface IConvenioClienteRepository extends PagingAndSortingRepository<ConvenioClienteEntity, Long> {

	ConvenioClienteEntity findByConvenioAndCliente(ConvenioEntity convenioEntity, ClienteEntity clienteEntity);
	
}
