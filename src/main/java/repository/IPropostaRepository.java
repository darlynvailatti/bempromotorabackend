package repository;

import domain.proposta.PropostaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;

@Repository
public interface IPropostaRepository extends PagingAndSortingRepository<PropostaEntity, Long> {

	PropostaEntity findFetchById(Long idProposta);

	
}
