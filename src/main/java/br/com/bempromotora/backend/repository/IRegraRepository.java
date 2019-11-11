package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.proposta.regra.RegraEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRegraRepository extends PagingAndSortingRepository<RegraEntity, Long> {

    Page<RegraEntity> findByModeloRegraId(Long idModeloRegra, Pageable page);

}
