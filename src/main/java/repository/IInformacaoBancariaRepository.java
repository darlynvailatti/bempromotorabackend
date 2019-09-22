
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.parceiro.InformacaoBancariaEntity;

@Repository
public interface IInformacaoBancariaRepository extends PagingAndSortingRepository<InformacaoBancariaEntity, Long> {


	//@EntityGraph(attributePaths= {"parceiro"}, type = @EntityGraph.EntityGraphType.LOAD)
	InformacaoBancariaEntity findFetchById(Long idInformacaoBancaria);
	
	Page<InformacaoBancariaEntity> findFetchByParceiro(Long idParceiro, Pageable pageRequest);
	Page<InformacaoBancariaEntity> findFetchByParceiroInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<InformacaoBancariaEntity> findFetchByBanco(String banco, Pageable pageRequest);
	
	
	Page<InformacaoBancariaEntity> findFetchByAgencia(String agencia, Pageable pageRequest);
	
	
	Page<InformacaoBancariaEntity> findFetchByConta(String conta, Pageable pageRequest);
	
	
	Page<InformacaoBancariaEntity> findFetchByAtiva(String ativa, Pageable pageRequest);
	
	
	Page<InformacaoBancariaEntity> findFetchByRecebimentoOuPagamento(String recebimentoOuPagamento, Pageable pageRequest);
	
	
	
}
