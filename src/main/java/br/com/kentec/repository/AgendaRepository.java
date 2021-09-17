package br.com.kentec.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.kentec.domain.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {
	
	@Query(nativeQuery = true, value="SELECT * FROM agenda AS a "
			+ "JOIN usuarios AS u "
			+ "ON u.id = a.id_usuario "
			+ "WHERE u.id = (:id) "
			+ "ORDER BY data DESC LIMIT 10 ")
	public List<Agenda> listarAgenda(@Param("id") Long id);
	
	@Query("SELECT a FROM Agenda a WHERE a.data = (:data) ")
	public List<Agenda> buscaAvancada(@Param("data") LocalDate data);

}
