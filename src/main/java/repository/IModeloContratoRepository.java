package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.proposta.contrato.ModeloContratoEntity;

@Repository
public interface IModeloContratoRepository extends PagingAndSortingRepository<ModeloContratoEntity, Long> {

	ModeloContratoEntity findFetchById(Long modeloContrato);

	Page<ModeloContratoEntity> findFetchByNome(String nome, Pageable pageRequest);

}
