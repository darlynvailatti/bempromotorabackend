package br.com.bempromotora.backend.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.bempromotora.backend.domain.proposta.contrato.ContratoArquivoEntity;

@Repository
public interface IContratoArquivoRepository extends PagingAndSortingRepository<ContratoArquivoEntity, Long> {


	
}
