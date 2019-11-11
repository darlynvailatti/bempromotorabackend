package br.com.bempromotora.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import br.com.bempromotora.backend.domain.proposta.contrato.ModeloContratoEntity;

@Repository
public interface IModeloContratoRepository extends PagingAndSortingRepository<ModeloContratoEntity, Long> {


}
