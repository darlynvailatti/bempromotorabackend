package br.com.bempromotora.backend.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.bempromotora.backend.domain.proposta.contrato.ClausulaEntity;

@Repository
public interface IClausulaRepository extends PagingAndSortingRepository<ClausulaEntity, Long> {


	
}
