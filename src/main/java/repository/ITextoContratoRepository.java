package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITextoContratoRepository extends PagingAndSortingRepository<TextoContrato, Long> {

	TextoContrato findFetchById(Long clausula);
	
	Page<TextoContrato> findFetchByOrdem(String ordem, Pageable pageRequest);
	
	
	
}
