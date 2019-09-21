package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContratoArquivoRepository extends PagingAndSortingRepository<ContratoArquivo, Long> {

	ContratoArquivo findFetchById(Long idArquivo);
	
	Page<ContratoArquivo> findFetchByContrato(Long idContrato, Pageable pageRequest);
	Page<ContratoArquivo> findFetchByContratoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	
	
	
}
