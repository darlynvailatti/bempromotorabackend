package br.com.bempromotora.backend.repository;


import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConvenioRepository extends PagingAndSortingRepository<ConvenioEntity, Long> {


}
