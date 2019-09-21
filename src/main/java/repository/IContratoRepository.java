package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContratoRepository extends PagingAndSortingRepository<Contrato, Long> {

	Contrato findFetchById(Long idContrato);
	
	Page<Contrato> findFetchByVersoesContrato(Long idVersao, Pageable pageRequest);

	Page<Contrato> findFetchByVersoesContratoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	
	
	
}
