package br.com.kentec.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="usuarios")
@SuppressWarnings("serial")
public class Usuarios implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="nome", nullable = false, length = 50)
	private String nome;
	
	@Column(name="sobre_nome", nullable = true, length = 100)
	private String sobreNome;
	
	@Column(name="data_de_nascimento", nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate dataDeNascimento;
	
	@Column(name="email", nullable = true, length = 100)
	private String email;
	
	@Column(name="senha", nullable = false, length = 10)
	private String senha;
	
	public Usuarios() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", dataDeNascimento="
				+ dataDeNascimento + ", email=" + email + ", senha=" + senha + "]";
	}
}
