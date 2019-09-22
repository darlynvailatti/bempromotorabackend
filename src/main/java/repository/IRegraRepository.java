package repository;

import domain.proposta.regra.RegraEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRegraRepository extends PagingAndSortingRepository<RegraEntity, Long> {

	RegraEntity findFetchById(Long idRegra);

	Page<RegraEntity> findFetchByIdModeloProposta(Long id, Pageable page);
}
