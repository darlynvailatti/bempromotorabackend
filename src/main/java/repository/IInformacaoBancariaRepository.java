package repository;

import domain.InformacaoBancaria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInformacaoBancariaRepository extends PagingAndSortingRepository<InformacaoBancaria, Long> {

	InformacaoBancaria findFetchById(Long idInformacaoBancaria);

	Page<InformacaoBancaria> findFetchByParceiro(Long idParceiro, Pageable pageRequest);

	Page<InformacaoBancaria> findFetchByParceiroInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);

	Page<InformacaoBancaria> findFetchByBanco(String banco, Pageable pageRequest);

	Page<InformacaoBancaria> findFetchByAgencia(String agencia, Pageable pageRequest);

	Page<InformacaoBancaria> findFetchByConta(String conta, Pageable pageRequest);
	
	Page<InformacaoBancaria> findFetchByAtiva(String ativa, Pageable pageRequest);
	
	Page<InformacaoBancaria> findFetchByRecebimentoOuPagamento(String recebimentoOuPagamento, Pageable pageRequest);
	
}
