
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.NotificacaoEntity;

@Repository
public interface INotificacaoRepository extends PagingAndSortingRepository<NotificacaoEntity, Long> {


	//@EntityGraph(attributePaths= {"parceiro"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"parceiro"}, type = @EntityGraph.EntityGraphType.LOAD)
	NotificacaoEntity findFetchById(Long idNotificacao);
	
	Page<NotificacaoEntity> findFetchByParceiroNotificado(Long idParceiroNotificador, Pageable pageRequest);
	Page<NotificacaoEntity> findFetchByParceiroNotificadoInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<NotificacaoEntity> findFetchByTextoNotificacao(String textoNotificacao, Pageable pageRequest);
	
	
	Page<NotificacaoEntity> findFetchByParceiroNotificador(Long idParceiroNotificado, Pageable pageRequest);
	Page<NotificacaoEntity> findFetchByParceiroNotificadorInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	
}
