package br.com.kentec.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.kentec.domain.Financeiro;


@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Long> {

	@Query(nativeQuery = true, value="SELECT * FROM financeiro AS f "
			+ "JOIN usuarios AS u "
			+ "ON u.id = f.id_usuario "
			+ "WHERE u.id = (:id) "
			+ "AND f.data BETWEEN :dataI AND :dataF "
			+ "ORDER BY f.vencimento    ")
	public List<Financeiro> listarFinanceiroId(
									@Param("id") Long id,
									@Param("dataI") String dataI,
									@Param("dataF") String dataF);
	
	@Query("SELECT f FROM Financeiro f "
			+ "JOIN f.usuario u "
			+ "WHERE u.id = (:id) "
			+ "AND f.data BETWEEN :dataI AND :dataF "
			+ "AND UPPER(f.tipo) LIKE UPPER(:tipo) "
			+ "AND UPPER(f.recurso) LIKE UPPER(:recurso) "
			+ "ORDER BY f.vencimento ")
	public List<Financeiro> buscaAvancadaFinanceiro(
									@Param("id") Long id,
									@Param("tipo") String tipo,
									@Param("recurso") String recurso,
									@Param("dataI") LocalDate dataI,
									@Param("dataF") LocalDate dataF);

}
