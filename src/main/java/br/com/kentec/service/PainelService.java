package br.com.kentec.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.kentec.DTO.AgendaDTO;
import br.com.kentec.DTO.AprenderDTO;
import br.com.kentec.DTO.FinanceiroDTO;
import br.com.kentec.DTO.TarefasDTO;
import br.com.kentec.domain.Agenda;
import br.com.kentec.domain.Aprender;
import br.com.kentec.domain.Financeiro;
import br.com.kentec.domain.Tarefas;
import br.com.kentec.domain.Usuarios;
import br.com.kentec.repository.AgendaRepository;
import br.com.kentec.repository.AprenderRepository;
import br.com.kentec.repository.FinanceiroRepository;
import br.com.kentec.repository.TarefasRepository;
import br.com.kentec.repository.UsuarioRepository;

@Service
public class PainelService {
	
	@Autowired
	private AgendaRepository ar;
	
	@Autowired
	private UsuarioRepository ur;
	
	@Autowired
	private TarefasRepository tr;
	
	@Autowired
	private FinanceiroRepository fr;
	
	@Autowired
	private AprenderRepository apr;
	
	public Optional<Usuarios> findById(Long id){
		return ur.findById(id);
	}

	public void createAgenda(AgendaDTO agendaDTO) {
		
		Optional<Usuarios> user = this.findById(agendaDTO.getUsuarioId());
		
	    Agenda agenda = new Agenda();
		agenda.setData(agendaDTO.getData());
		agenda.setHora(agendaDTO.getHora());
		agenda.setAssunto(agendaDTO.getAssunto());
		agenda.setDescricao(agendaDTO.getDescricao());
		agenda.setUsuario(user.get());
		ar.save(agenda);
	}
	
	public void updateAgenda(AgendaDTO agendaDTO) {
		Optional<Agenda> agenda = ar.findById(agendaDTO.getId());
		
		if(agenda.isPresent()) {
			agenda.get().setData(agendaDTO.getData());
			agenda.get().setHora(agendaDTO.getHora());
			agenda.get().setAssunto(agendaDTO.getAssunto());
			agenda.get().setDescricao(agendaDTO.getDescricao());
			ar.save(agenda.get());
		}
	}
	
	public void createTarefa(TarefasDTO tarefasDTO) {
		
		Optional<Usuarios> user = this.findById(tarefasDTO.getUsuarioId());
		
		Tarefas tarefa = new Tarefas();
		tarefa.setInicio(tarefasDTO.getInicio());
		tarefa.setTermino(tarefasDTO.getEntrega());
		tarefa.setHora(tarefasDTO.getHora());
		tarefa.setPrioridade(tarefasDTO.getPrioridade());
		tarefa.setDescricao(tarefasDTO.getDescricao());
		tarefa.setObservacao(tarefasDTO.getObservacao());
		tarefa.setStatusTarefa(tarefasDTO.getStatusTarefa());
		tarefa.setUsuario(user.get());
		tr.save(tarefa);
		
	}
	
	public void createFinanceiro(FinanceiroDTO financeiroDTO) {
		
		Optional<Usuarios> user = this.findById(financeiroDTO.getUsuarioId());
		
		Financeiro financeiro = new Financeiro();
		financeiro.setRecurso(financeiroDTO.getRecurso());
		financeiro.setData(financeiroDTO.getData());
		financeiro.setTipo(financeiroDTO.getTipo());
		financeiro.setReferente(financeiroDTO.getReferente());
		financeiro.setValor(financeiroDTO.getValor());
		financeiro.setDocumento(financeiroDTO.getDocumento());
		financeiro.setDescricao(financeiroDTO.getDescricao());
		financeiro.setVencimento(financeiroDTO.getVencimento());
		financeiro.setStatus(financeiroDTO.getStatus());
		financeiro.setUsuario(user.get());
		fr.save(financeiro);
	}
	
	public void createAprender(AprenderDTO aprenderDTO) {
			
		Optional<Usuarios> user = this.findById(aprenderDTO.getUsuarioId());
		
		Aprender aprender = new Aprender();
		aprender.setModalidade(aprenderDTO.getModalidade());
		aprender.setData(aprenderDTO.getData());
		aprender.setTitulo(aprenderDTO.getTitulo());
		aprender.setUrl(aprenderDTO.getUrl());
		aprender.setDescricao(aprenderDTO.getDescricao());
		aprender.setUsuario(user.get());
		apr.save(aprender);
		
	}
}
