package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILocalidadeRepository extends PagingAndSortingRepository<Localidade, Long> {

	Localidade findFetchById(Long idLocalidade);

	Page<Localidade> findFetchByDescricao(String descricao, Pageable pageRequest);
	
	Page<Localidade> findFetchByParceiro(Long idParceiro, Pageable pageRequest);

	Page<Localidade> findFetchByParceiroInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);

	Page<Localidade> findFetchByResidencialouComercial(String residencialouComercial, Pageable pageRequest);

	Page<Localidade> findFetchByInformacaoBancaria(Long idInformacaoBancaria, Pageable pageRequest);

	Page<Localidade> findFetchByInformacaoBancariaInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	
	
	
	
}
