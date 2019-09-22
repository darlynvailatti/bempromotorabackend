package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.proposta.contrato.TextoContratoEntity;
@Repository
public interface ITextoContratoRepository extends PagingAndSortingRepository<TextoContratoEntity, Long> {

	TextoContratoEntity findFetchById(Long clausula);
	
	Page<TextoContratoEntity> findFetchByOrdem(String ordem, Pageable pageRequest);
	
	
	
}
