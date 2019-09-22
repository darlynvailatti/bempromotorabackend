package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import domain.proposta.contrato.ClausulaEntity;
import rest.dto.ClausulaDTO;

import java.util.Date;

@Repository
public interface IClausulaRepository extends PagingAndSortingRepository<ClausulaEntity, Long> {

	ClausulaEntity findFetchById(Long clausula);

	Page<ClausulaDTO> findFetchByDescricao(String descricao, Pageable pageRequest);

	Page<ClausulaEntity> findFetchByDataFinalDeVigencia(Date dataFinalDeVigencia, Pageable pageRequest);
	
	
	
}
