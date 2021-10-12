package br.com.kentec.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.kentec.domain.Financeiro;

public class FinanceiroDTO {
	
	private Long id;
	private String recurso;
	private LocalDate data;
	private String tipo;
	private String referente;
	private String descricao;
	private String documento;
	private BigDecimal valor;
	private String status;
	private LocalDate vencimento;
	private Long usuarioId;
	
	public FinanceiroDTO() {
		
	}
	
	public FinanceiroDTO(Financeiro financeiro) {
		this.id = financeiro.getId();
		this.recurso = financeiro.getRecurso();
		this.data = financeiro.getData();
		this.tipo = financeiro.getTipo();
		this.referente = financeiro.getReferente();
		this.descricao = financeiro.getDescricao();
		this.documento = financeiro.getDocumento();
		this.valor = financeiro.getValor();
		this.status = financeiro.getStatus();
		this.vencimento = financeiro.getVencimento();
		this.usuarioId = financeiro.getUsuario().getId();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRecurso() {
		return recurso;
	}
	
	public void setRecurso(String recurso) {
		this.recurso = recurso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getReferente() {
		return referente;
	}

	public void setReferente(String referente) {
		this.referente = referente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public String toString() {
		return "FinanceiroDTO [id=" + id + ", recurso=" + recurso + ", data=" + data + ", tipo=" + tipo + ", referente="
				+ referente + ", descricao=" + descricao + ", documento=" + documento + ", valor=" + valor + ", status="
				+ status + ", vencimento=" + vencimento + ", usuarioId=" + usuarioId + "]";
	}
	
}
