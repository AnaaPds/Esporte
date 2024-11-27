package com.example.viagem01.viagem01.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.viagem01.viagem01.Model.UsuarioModel;
import com.example.viagem01.viagem01.Repository.UsuarioRepository;


	@RestController
	@RequestMapping("/viagem")
	public class UsuarioController {

	    @Autowired
	    private UsuarioRepository repository;

	   
	    @GetMapping
	    public ResponseEntity<List<UsuarioModel>> getUsuarios() {
	        List<UsuarioModel> listaUsuarios = repository.findAll();
	        return ResponseEntity.ok(listaUsuarios);
	    }

	   
	    @PostMapping
	    public ResponseEntity<String> postUsuario(@RequestBody UsuarioModel usuario) {
	        repository.save(usuario);
	        return ResponseEntity.ok("Usuário cadastrado com sucesso: " + usuario.getNome());
	    }

	   
	    @PutMapping("/{id}")
	    public ResponseEntity<String> putUsuario(@PathVariable UUID id, @RequestBody UsuarioModel usuarioAtualizado) {
	        
	        UsuarioModel usuarioExistente = repository.findById(id).orElse(null);
	        
	      
	        if (usuarioExistente != null) {
	            usuarioExistente.setNome(usuarioAtualizado.getNome());  
	            repository.save(usuarioExistente);
	            return ResponseEntity.ok("Usuário atualizado: " + usuarioExistente);
	        } else {
	            return ResponseEntity.status(404).body("Usuário não encontrado.");
	        }
	    }

	}

	
