package br.com.kentec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.DTO.AgendaDTO;
import br.com.kentec.DTO.AprenderDTO;
import br.com.kentec.DTO.FinanceiroDTO;
import br.com.kentec.DTO.TarefasDTO;
import br.com.kentec.service.PainelService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("7475646f61717569/api/painel")
public class PainelController {
	
	@Autowired
	private PainelService ps;
	
	@PostMapping("/agenda")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody AgendaDTO agenda) {
		System.out.println(agenda);
		ps.createAgenda(agenda);
	}
	
	@PutMapping("/alterarAgenda")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateAgenda(@RequestBody AgendaDTO agendaDTO) {
			ps.updateAgenda(agendaDTO);
	}
	
	@PostMapping("/tarefa")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody TarefasDTO tarefas) {
		ps.createTarefa(tarefas);
	}
	
	@PostMapping("/financeiro")
	@ResponseStatus(HttpStatus.CREATED)
	public void createFinanceiro(@RequestBody FinanceiroDTO financeiro) {
		ps.createFinanceiro(financeiro);
	}
	
	@PostMapping("/aprender")
	@ResponseStatus(HttpStatus.CREATED)
	public void createAprender(@RequestBody AprenderDTO aprender) {
		ps.createAprender(aprender);
	}
}
