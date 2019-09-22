
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.parceiro.LogradouroEntity;

@Repository
public interface ILogradouroRepository extends PagingAndSortingRepository<LogradouroEntity, Long> {


	//@EntityGraph(attributePaths= {"localidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"cidade"}, type = @EntityGraph.EntityGraphType.LOAD)
	LogradouroEntity findFetchById(Long idLogradouro);
	
	Page<LogradouroEntity> findFetchByLocalidade(Long idLocalidade, Pageable pageRequest);
	Page<LogradouroEntity> findFetchByLocalidadeInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	Page<LogradouroEntity> findFetchByEndereco(String endereco, Pageable pageRequest);
	
	
	Page<LogradouroEntity> findFetchByNumero(String numero, Pageable pageRequest);
	
	
	Page<LogradouroEntity> findFetchByComplemento(String complemento, Pageable pageRequest);
	
	
	Page<LogradouroEntity> findFetchByBairro(String bairro, Pageable pageRequest);
	
	
	Page<LogradouroEntity> findFetchByCEP(String cEP, Pageable pageRequest);
	
	
	
}
