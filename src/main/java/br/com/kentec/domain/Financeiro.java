package br.com.kentec.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="financeiro")
@SuppressWarnings("serial")
public class Financeiro  implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="recurso", nullable = true, length = 20)
	private String recurso;
	
	@Column(name="data", nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate data;
	
	@Column(name="descricao", nullable = true, length = 300)
	private String descricao;
	
	@Column(name="valor", nullable = true, precision = 10, scale = 2)
	private BigDecimal valor;
	
	@Column(name="documento", nullable = true, length = 30)
	private String documento;
	
	@Column(name="referente", nullable = true, length = 50)
	private String referente;
	
	@Column(name="vencimento", nullable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate vencimento;
	
	@Column(name="tipo", nullable = false, length = 15)
	private String tipo;
	
	@Column(name="status", nullable = true, length = 30)
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuarios usuario = new Usuarios();
	
	public Financeiro() {
		
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public String getReferente() {
		return referente;
	}

	public void setReferente(String referente) {
		this.referente = referente;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Financeiro [id=" + id + ", recurso=" + recurso + ", data=" + data + ", descricao=" + descricao
				+ ", valor=" + valor + ", documento=" + documento + ", referente=" + referente + ", vencimento="
				+ vencimento + ", tipo=" + tipo + ", status=" + status + ", usuario=" + usuario + "]";
	}

}
