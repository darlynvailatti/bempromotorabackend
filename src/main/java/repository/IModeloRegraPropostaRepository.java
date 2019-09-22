package repository;

import domain.proposta.regra.ModeloRegraPropostaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IModeloRegraPropostaRepository extends PagingAndSortingRepository<ModeloRegraPropostaEntity, Long> {

	ModeloRegraPropostaEntity findFetchById(Long idModeloDeRegra);
	
	Page<ModeloRegraPropostaEntity> findVigente(Pageable pageRequest);

}
