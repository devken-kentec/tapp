package br.com.kentec.DTO;

import java.time.LocalDate;

public class AprenderDTO {
	
	private LocalDate data;
	private String modalidade;
	private String titulo;
	private String descricao;
	private String url;
	private Long usuarioId;
	
	public AprenderDTO() {
		
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
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

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public String toString() {
		return "AprenderDTO [data=" + data + ", modalidade=" + modalidade + ", titulo=" + titulo + ", descricao="
				+ descricao + ", url=" + url + ", usuarioId=" + usuarioId + "]";
	}

}
