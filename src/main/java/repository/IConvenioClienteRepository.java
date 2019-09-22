package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import domain.cliente.ConvenioClienteEntity;
@Repository
public interface IConvenioClienteRepository extends PagingAndSortingRepository<ConvenioClienteEntity, Long> {

	ConvenioClienteEntity findFetchById(Long idConvenio);

	Page<ConvenioClienteEntity> findFetchByMatricula(String matricula, Pageable pageRequest);

	Page<ConvenioClienteEntity> findFetchByDataEntrada(Date dataEntrada, Pageable pageRequest);

	Page<ConvenioClienteEntity> findFetchByDataFim(Date dataFim, Pageable pageRequest);

	
	
}
