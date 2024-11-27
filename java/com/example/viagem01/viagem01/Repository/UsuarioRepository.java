package com.example.viagem01.viagem01.Repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.viagem01.viagem01.Model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel,UUID> {
	
	
    Optional<UsuarioModel> findByEmail(String email);

 
    Optional<UsuarioModel> findByNome(String nome);
}


