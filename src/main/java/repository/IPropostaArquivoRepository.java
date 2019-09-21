package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropostaArquivoRepository extends PagingAndSortingRepository<PropostaArquivo, Long> {

	PropostaArquivo findFetchById(Long idArquivo);
	Page<PropostaArquivo> findFetchByProposta(Long idProposta, Pageable pageRequest);
	Page<PropostaArquivo> findFetchByPropostaInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);

}
