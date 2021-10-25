package br.com.kentec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.domain.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long>{
	
	public Optional<Usuarios> findBySenha(String senha);
}
