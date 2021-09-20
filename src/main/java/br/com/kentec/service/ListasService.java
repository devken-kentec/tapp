package br.com.kentec.service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.DTO.AgendaDTO;
import br.com.kentec.DTO.TarefasDTO;
import br.com.kentec.domain.Agenda;
import br.com.kentec.repository.AgendaRepository;
import br.com.kentec.repository.TarefasRepository;

@Service
public class ListasService {
	
	@Autowired
	private AgendaRepository ar;
	
	@Autowired
	private TarefasRepository tr;
	
	public Optional<AgendaDTO> listarAgenda(Long id){
		return ar.findById(id).map(AgendaDTO::new);
	} 
	
	public List<AgendaDTO> listarAgendaId(Long idUsuario){
		return ar.listarAgenda(idUsuario).stream().map(AgendaDTO::new).collect(Collectors.toList());
	}
	
	public List<AgendaDTO> buscaAvancada(LocalDate data){
		return ar.buscaAvancada(data).stream().map(AgendaDTO::new).collect(Collectors.toList());
	}
	
	public void removeAgenda(Long id) {
		Optional<Agenda> agenda = ar.findById(id);
		
		if(agenda.isPresent()) {
			ar.deleteById(id);
		}
	}
	
	public List<TarefasDTO> listarTarefasId(Long idUsuario){
		return tr.listarTarefa(idUsuario).stream().map(TarefasDTO::new).collect(Collectors.toList());
	}
	
	public Optional<TarefasDTO> listarTarefa(Long id){
		return tr.findById(id).map(TarefasDTO::new);
	} 
}
