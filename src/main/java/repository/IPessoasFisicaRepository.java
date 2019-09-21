package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPessoasFisicaRepository extends PagingAndSortingRepository<PessoaFisica, Long> {

	PessoaFisica findFetchById(Long idParceiro);

	Page<PessoaFisica> findFetchByCPF(String cPF, Pageable pageRequest);

	Page<PessoaFisica> findFetchByFuncionrio(String funcionrio, Pageable pageRequest);

	Page<PessoaFisica> findFetchByPessoaJuridica(Long idFuncionarioDeRepresentante, Pageable pageRequest);

	Page<PessoaFisica> findFetchByPessoaJuridicaInitialContaininigIgnoreCase(String initilas, Pageable pageRequest);

}
