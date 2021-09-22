package br.com.kentec.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.kentec.domain.Tarefas;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Long> {
	
	@Query(nativeQuery = true, value="SELECT * FROM tarefas AS t "
			+ "JOIN usuarios AS u "
			+ "ON u.id = t.id_usuario "
			+ "WHERE u.id = (:id) "
			+ "ORDER BY t.termino ASC LIMIT 10 ")
	public List<Tarefas> listarTarefa(@Param("id") Long id);
	
	@Query("SELECT t FROM Tarefas t WHERE t.inicio = (:data) ")
	public List<Tarefas> buscaAvancada(@Param("data") LocalDate data);
}
