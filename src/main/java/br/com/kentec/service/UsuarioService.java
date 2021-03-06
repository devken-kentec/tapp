package br.com.kentec.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.domain.Usuarios;
import br.com.kentec.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository ur;
	
	public Long startServer() {
		return ur.count();
	}
	
	public Optional<Usuarios> findBySenha(Long pin){
		return ur.findBySenha(pin.toString());
	} 
	
	public void create(Usuarios usuario) {
		ur.save(usuario);
	}
}
