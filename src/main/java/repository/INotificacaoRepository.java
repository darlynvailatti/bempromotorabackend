package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INotificacaoRepository extends PagingAndSortingRepository<Notificacao, Long> {

	Notificacao findFetchById(Long idNotificacao);
	Page<Notificacao> findFetchByTextoNotificacao(String textoNotificacao, Pageable pageRequest);
	Page<Notificacao> findFetchByParceiro(Long idParceiroNotificado, Pageable pageRequest);
	Page<Notificacao> findFetchByParceiroInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);

}
