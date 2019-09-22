package repository;


import org.springframework.data.domain.Page;
import domain.cliente.ConvenioEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConvenioRepository extends PagingAndSortingRepository<ConvenioEntity, Long> {

	ConvenioEntity findFetchById(Long idConvenio);

	Page<ConvenioEntity> findFetchByDescricao(String descricao, Pageable pageRequest);

}
