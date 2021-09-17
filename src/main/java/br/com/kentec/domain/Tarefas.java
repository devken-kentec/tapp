package br.com.kentec.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tarefas")
@SuppressWarnings("serial")
public class Tarefas implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="inicio", nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate inicio;
	
	@Column(name="termino", nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate termino;
	
	@Column(name="hora", nullable = true, length = 5)
	private String hora;
	
	@Column(name="prioridade", nullable = true, length = 20)
	private String prioridade;
	
	@Column(name="descricao", nullable = true, length = 300)
	private String descricao;
	
	@Column(name="observacao", nullable = true, length = 100)
	private String observacao;
	
	@Column(name="status_tarefa", nullable = true, length = 20)
	private String statusTarefa;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuarios usuario = new Usuarios();
	
	public Tarefas() {
		
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

	public LocalDate getTermino() {
		return termino;
	}

	public void setTermino(LocalDate termino) {
		this.termino = termino;
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

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Tarefas [id=" + id + ", inicio=" + inicio + ", termino=" + termino + ", prioridade=" + prioridade
				+ ", descricao=" + descricao + ", observacao=" + observacao + ", statusTarefa=" + statusTarefa
				+ ", usuario=" + usuario + "]";
	}
	
}
