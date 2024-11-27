package com.example.demo;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id_user;
    private String cpf;
    private String aniver;
    private String email;
    private String senha;
    
	public UserModel(UserDTO user) {
		super();
		this.id_user = user.id();
		this.cpf = user.cpf();
		this.aniver = user.aniver();
		this.email = user.email();
		this.senha = user.senha();
	}

    
}
