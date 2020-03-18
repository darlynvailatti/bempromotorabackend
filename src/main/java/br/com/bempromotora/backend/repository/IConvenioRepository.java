package br.com.bempromotora.backend.repository;


import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "convenios", collectionResourceRel = "convenios")
public interface IConvenioRepository extends PagingAndSortingRepository<ConvenioEntity, Long> {

}
