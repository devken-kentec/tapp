package br.com.kentec.DTO;

import java.time.LocalDate;

import br.com.kentec.domain.Agenda;

public class AgendaDTO {
	
	private Long id;
	private LocalDate data;
	private String hora;
	private String assunto;
	private String descricao;
	private Long usuarioId;
	private String usuario;
	
	public AgendaDTO() {
		
	}
	
	public AgendaDTO(Agenda ag) {
		this.id = ag.getId();
		this.data = ag.getData();
		this.hora = ag.getHora();
		this.assunto = ag.getAssunto();
		this.descricao = ag.getDescricao();
		this.usuarioId = ag.getUsuario().getId();
		this.usuario = ag.getUsuario().getNome();
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

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "AgendaDTO [id=" + id + ", data=" + data + ", hora=" + hora + ", assunto=" + assunto + ", descricao="
				+ descricao + ", usuarioId=" + usuarioId + ", usuario=" + usuario + "]";
	}
}
