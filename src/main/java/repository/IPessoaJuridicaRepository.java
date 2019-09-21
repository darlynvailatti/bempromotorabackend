package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPessoaJuridicaRepository extends PagingAndSortingRepository<PessoaJuridica, Long> {

	PessoaJuridica findFetchById(Long parceiro);
	
	Page<PessoaJuridica> findFetchByCNPJ(String cNPJ, Pageable pageRequest);

	Page<PessoaJuridica> findFetchByRazaoSocial(String razaoSocial, Pageable pageRequest);

	Page<PessoaJuridica> findFetchByRepresentante(String representante, Pageable pageRequest);

}
