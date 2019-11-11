package br.com.bempromotora.backend.repository;

import br.com.bempromotora.backend.domain.common.DocumentoArquivoEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocumentoArquivoRepository extends PagingAndSortingRepository<DocumentoArquivoEntity, Long> {


}
