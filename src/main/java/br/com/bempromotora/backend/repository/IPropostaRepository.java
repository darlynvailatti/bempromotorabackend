package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropostaRepository extends PagingAndSortingRepository<PropostaEntity, Long> {
}
