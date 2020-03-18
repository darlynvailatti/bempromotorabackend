package br.com.bempromotora.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import br.com.bempromotora.backend.domain.cliente.ClienteEntity;

@RepositoryRestResource(path = "clientes", collectionResourceRel = "clientes")
public interface IClienteRepository extends PagingAndSortingRepository<ClienteEntity, Long> {

}
