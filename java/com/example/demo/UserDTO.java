package com.example.demo;

import java.util.UUID;

public record UserDTO(UUID id, String cpf, String aniver, String email, String senha) {

}
