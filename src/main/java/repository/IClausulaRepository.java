package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface IClausulaRepository extends PagingAndSortingRepository<Clausula, Long> {

	Clausula findFetchById(Long clausula);

	Page<Clausula> findFetchByDescricao(String descricao, Pageable pageRequest);

	Page<Clausula> findFetchByDataFinalDeVigencia(Date dataFinalDeVigencia, Pageable pageRequest);
	
	
	
}
