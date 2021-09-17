package br.com.kentec.DTO;

import java.time.LocalDate;

import br.com.kentec.domain.Tarefas;

public class TarefasDTO {
	
	private Long id;
	private LocalDate inicio;
	private LocalDate entrega;
	private String hora;
	private String prioridade;
	private String descricao;
	private String observacao;
	private String statusTarefa;
	private Long usuarioId;
	
	public TarefasDTO() {
		
	}
	
	public TarefasDTO(Tarefas tarefa) {
		this.id = tarefa.getId();
		this.inicio = tarefa.getInicio();
		this.entrega = tarefa.getTermino();
		this.hora = tarefa.getHora();
		this.prioridade = tarefa.getPrioridade();
		this.descricao = tarefa.getDescricao();
		this.observacao = tarefa.getObservacao();
		this.statusTarefa = tarefa.getStatusTarefa();
		this.usuarioId = tarefa.getUsuario().getId();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getEntrega() {
		return entrega;
	}

	public void setEntrega(LocalDate entrega) {
		this.entrega = entrega;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getStatusTarefa() {
		return statusTarefa;
	}

	public void setStatusTarefa(String statusTarefa) {
		this.statusTarefa = statusTarefa;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public String toString() {
		return "TarefasDTO [id=" + id + ", inicio=" + inicio + ", entrega=" + entrega + ", hora=" + hora
				+ ", prioridade=" + prioridade + ", descricao=" + descricao + ", observacao=" + observacao
				+ ", statusTarefa=" + statusTarefa + ", usuarioId=" + usuarioId + "]";
	}
	
	
}
