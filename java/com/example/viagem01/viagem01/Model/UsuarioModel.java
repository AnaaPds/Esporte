package com.example.viagem01.viagem01.Model;

import java.util.UUID;

import com.example.viagem01.viagem01.DTO.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;


@Entity
@Table(name="viagem")

public class UsuarioModel {
	
	@GeneratedValue (strategy = GenerationType.UUID)
	@Id
	private UUID id;
	private String  nome;
	private String cpf;
	private String email;
	private String telefone;
	private String origem;
	private String destino;
	private String imagem;
	private String numero_voo;
	

	public UsuarioModel (UsuarioDTO  dto) {
		
		this.nome = dto.nome();
		this.cpf = dto.cpf();
		this.email = dto.email();
		this.telefone = dto.telefone();
		this.origem = dto.origem();
		this.destino = dto.destino();
		this.imagem = dto.imagem();
		this.numero_voo = dto.numero_voo();
		
	}





	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getOrigem() {
		return origem;
	}


	public void setOrigem(String origem) {
		this.origem = origem;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getImagem() {
		return imagem;
	}


	public void setImagem(String imagem) {
		this.imagem = imagem;
	}


	public String getNumero_voo() {
		return numero_voo;
	}


	public void setNumero_voo(String numero_voo) {
		this.numero_voo = numero_voo;
	}





	public void adicionarViagem(String destino2) {
		// TODO Auto-generated method stub
		
	}
	
	
	}