package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.common.DocumentoEntity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocumentoRepository extends PagingAndSortingRepository<DocumentoEntity, Long> {

}
