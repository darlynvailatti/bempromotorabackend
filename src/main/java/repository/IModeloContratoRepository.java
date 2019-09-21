package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IModeloContratoRepository extends PagingAndSortingRepository<ModeloContrato, Long> {

	ModeloContrato findFetchById(Long modeloContrato);

	Page<ModeloContrato> findFetchByNome(String nome, Pageable pageRequest);

}
