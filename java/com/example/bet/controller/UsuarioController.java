package com.example.bet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bet.dto.UsuarioDTO;
import com.example.bet.model.UsuarioModel;
import com.example.bet.repository.UsuarioRepository;

@RestController
@RequestMapping("api")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository repository;
	
	@PostMapping("/cadastrar")
	public ResponseEntity <?> salvarUsuario(@RequestBody UsuarioDTO usuario){
		UsuarioModel user = new UsuarioModel(usuario);
		repository.save(user);
		return ResponseEntity.ok("Calvo com sucesso");



	}

}
