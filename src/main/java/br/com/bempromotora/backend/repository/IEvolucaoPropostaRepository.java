package br.com.bempromotora.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.bempromotora.backend.domain.proposta.EvolucaoPropostaEntity;

@Repository
public interface IEvolucaoPropostaRepository extends PagingAndSortingRepository<EvolucaoPropostaEntity, Long> {


}
