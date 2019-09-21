package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegraRepository extends PagingAndSortingRepository<Regra, Long> {

	Regra findFetchById(Long idRegra);
	Page<Regra> findFetchByModeloRegrasProposta(Long idModelodeRegra, Pageable pageRequest);
	Page<Regra> findFetchByModeloRegrasPropostaInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);
	Page<Regra> findFetchByDescricao(String descricao, Pageable pageRequest);
	Page<Regra> findFetchByOperadorComparacao(String operadorComparacao, Pageable pageRequest);
	Page<Regra> findFetchByInformacao(Long idInformacaoComparacao, Pageable pageRequest);
	Page<Regra> findFetchByInformacaoInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);

}
