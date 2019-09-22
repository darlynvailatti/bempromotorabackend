
package repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import domain.parceiro.PessoasFisicaEntity;

@Repository
public interface IPessoasFisicaRepository extends PagingAndSortingRepository<PessoasFisicaEntity, Long> {


	//@EntityGraph(attributePaths= {"pessoaJuridica"}, type = @EntityGraph.EntityGraphType.LOAD)
	

	//@EntityGraph(attributePaths= {"parceiro"}, type = @EntityGraph.EntityGraphType.LOAD)
	PessoasFisicaEntity findFetchById(Long idParceiro);
	
	Page<PessoasFisicaEntity> findFetchByCPF(String cPF, Pageable pageRequest);
	
	
	Page<PessoasFisicaEntity> findFetchByFuncionrio(String funcionrio, Pageable pageRequest);
	
	
	Page<PessoasFisicaEntity> findFetchByPessoaJuridica(Long idFuncionarioDeRepresentante, Pageable pageRequest);
	Page<PessoasFisicaEntity> findFetchByPessoaJuridicaInitialContaininigIgnoreCase(String initials, Pageable pageRequest);
	
	
	
	
}
