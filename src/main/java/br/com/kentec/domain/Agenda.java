package br.com.kentec.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="agenda")
@SuppressWarnings("serial")
public class Agenda implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="data", nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate data;
	
	@Column(name="hora", nullable = true, length = 5)
	private String hora;
	
	@Column(name="assunto", nullable = true, length = 50)
	private String assunto;
	
	@Column(name="descricao", nullable = true, length = 300)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuarios usuario = new Usuarios();

	public Agenda() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Agenda [id=" + id + ", data=" + data + ", hora=" + hora + ", assunto=" + assunto + ", descricao="
				+ descricao + ", usuario=" + usuario + "]";
	}
}
