package repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConvenioRepository extends PagingAndSortingRepository<Convenio, Long> {

	Convenio findFetchById(Long idConvenio);

	Page<Convenio> findFetchByDescricao(String descricao, Pageable pageRequest);

}
