package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IConvenioClienteRepository extends PagingAndSortingRepository<ConvenioCliente, Long> {

	ConvenioCliente findFetchById(Long idConvenio);

	Page<ConvenioCliente> findFetchByMatricula(String matricula, Pageable pageRequest);

	Page<ConvenioCliente> findFetchByDataEntrada(Date dataEntrada, Pageable pageRequest);

	Page<ConvenioCliente> findFetchByDataFim(Date dataFim, Pageable pageRequest);

	
	
}
