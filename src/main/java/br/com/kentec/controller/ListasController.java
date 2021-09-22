package br.com.kentec.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.kentec.DTO.AgendaDTO;
import br.com.kentec.DTO.TarefasDTO;
import br.com.kentec.service.ListasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("7475646f61717569/api/listas")
public class ListasController {
	
	@Autowired
	private ListasService ls;
	
	@GetMapping("/listarAgendaId/{id}")
	public ResponseEntity<AgendaDTO> listarAgenda(@PathVariable("id") Long id) {
		Optional<AgendaDTO> agenda = ls.listarAgenda(id);
		return agenda.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	} 
	
	@GetMapping("/listarAgenda/{idUsuario}")
	public ResponseEntity<List<AgendaDTO>> listarAgendaId(@PathVariable("idUsuario") Long idUsuario){
		return ResponseEntity.ok(ls.listarAgendaId(idUsuario));
	} 
	
	@GetMapping("/buscarAgenda")
	public ResponseEntity<List<AgendaDTO>> buscaAvancada(
				@RequestParam(value ="data", required = false, defaultValue="") String data){

		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		  LocalDate localDate = LocalDate.parse(data, formatter);
		  
		return ResponseEntity.ok(ls.buscaAvancada(localDate));
	}
	
	
	@DeleteMapping("/excluirAgenda/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeAgenda(@PathVariable("id") Long id) {
		ls.removeAgenda(id);
	}
	
	
	@GetMapping("/listarTarefa/{idUsuario}")
	public ResponseEntity<List<TarefasDTO>> listarTarefasId(@PathVariable("idUsuario") Long idUsuario){
		return ResponseEntity.ok(ls.listarTarefasId(idUsuario));
	} 
	
	@GetMapping("/listarTarefaId/{id}")
	public ResponseEntity<TarefasDTO> listarTarefa(@PathVariable("id") Long id) {
		Optional<TarefasDTO> tarefa = ls.listarTarefa(id);
		return tarefa.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	} 
	
	@DeleteMapping("/excluirTarefa/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeTarefa(@PathVariable("id") Long id) {
		ls.removeTarefa(id);
	}
	
	@GetMapping("/buscarTarefa")
	public ResponseEntity<List<TarefasDTO>> buscaAvancadaTarefa(
				@RequestParam(value ="data", required = false, defaultValue="") String data){

		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		  LocalDate localDate = LocalDate.parse(data, formatter);
		  
		return ResponseEntity.ok(ls.buscaAvancadaTarefa(localDate));
	}
	
}
