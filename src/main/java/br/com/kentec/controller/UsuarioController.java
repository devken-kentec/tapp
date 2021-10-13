package br.com.kentec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.kentec.domain.Usuarios;
import br.com.kentec.service.UsuarioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("7475646f61717569/api/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService us;
	
	@GetMapping("/count")
	public ResponseEntity<Long> startServer(){
		System.out.println(us.startServer());
		return ResponseEntity.ok(us.startServer());
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Usuarios usuario) {
		us.create(usuario);
	}
}
