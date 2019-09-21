package repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IParceiroRepository extends PagingAndSortingRepository<Parceiro, Long> {

	Parceiro findFetchById(Long idParceiro);

	Page<Parceiro> findFetchByApelido(String apelido, Pageable pageRequest);

	Page<Parceiro> findFetchByAtivo(String ativo, Pageable pageRequest);

	
}
