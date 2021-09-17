package br.com.kentec.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="aprender")
@SuppressWarnings("serial")
public class Aprender implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="modalidade", nullable = true, length = 15)
	private String modalidade;
	
	@Column(name="data", nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate data;
	
	@Column(name="titulo", nullable = true, length = 15)
	private String titulo;
	
	@Column(name="descricao", nullable = true, length = 50)
	private String descricao;
	
	@Column(name="url", nullable = true, length = 100)
	private String url;

	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuarios usuario = new Usuarios();
	
	public Aprender() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Aprender [id=" + id + ", modalidade=" + modalidade + ", data=" + data + ", titulo=" + titulo
				+ ", descricao=" + descricao + ", url=" + url + ", usuario=" + usuario + "]";
	}
	
}	
