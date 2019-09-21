package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICidadeRepository extends PagingAndSortingRepository<Cidade, Long> {


	Cidade findFetchById(Long idCidade);
	
	Page<Cidade> findFetchByDescricao(String descricao, Pageable pageRequest);
	
	Page<Cidade> findFetchByUF(String uf, Pageable pageRequest);

	Page<Cidade> findFetchByPais(String pais, Pageable pageRequest);
	
	
	
}
