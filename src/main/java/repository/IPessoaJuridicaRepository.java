
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.parceiro.PessoaJuridicaEntity;

@Repository
public interface IPessoaJuridicaRepository extends PagingAndSortingRepository<PessoaJuridicaEntity, Long> {


	//@EntityGraph(attributePaths= {"parceiro"}, type = @EntityGraph.EntityGraphType.LOAD)
	PessoaJuridicaEntity findFetchById(Long idParceiro);
	
	Page<PessoaJuridicaEntity> findFetchByCNPJ(String cNPJ, Pageable pageRequest);
	
	
	Page<PessoaJuridicaEntity> findFetchByRazaoSocial(String razaoSocial, Pageable pageRequest);
	
	
	Page<PessoaJuridicaEntity> findFetchByRepresentante(String representante, Pageable pageRequest);
	
	
	
}
