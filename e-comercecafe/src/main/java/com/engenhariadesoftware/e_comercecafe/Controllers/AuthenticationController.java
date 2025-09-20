package com.engenhariadesoftware.e_comercecafe.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engenhariadesoftware.e_comercecafe.DTOs.Request.UsuarioRequestDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.AuthenticationDTO;
import com.engenhariadesoftware.e_comercecafe.DTOs.Response.UsuarioResponseDTO;
import com.engenhariadesoftware.e_comercecafe.Models.UsuarioModel;
import com.engenhariadesoftware.e_comercecafe.Repositories.UsuarioRepository;
import com.engenhariadesoftware.e_comercecafe.ValueObjects.CPF;
import com.engenhariadesoftware.e_comercecafe.ValueObjects.Email;
import com.engenhariadesoftware.e_comercecafe.ValueObjects.Senha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("/login")
    public ResponseEntity<AuthenticationDTO> login(@RequestBody AuthenticationDTO authenticationDTO){
        var usernamePassword = new UsernamePasswordAuthenticationToken(authenticationDTO.email(), authenticationDTO.senha());
        var auth = this.authenticationManager.authenticate(usernamePassword);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/register")
    public ResponseEntity<UsuarioResponseDTO> register(@RequestBody UsuarioRequestDTO usuarioRequestDTO){
        if(this.usuarioRepository.findByEmail_Value(usuarioRequestDTO.getEmail()) != null){
            return ResponseEntity.badRequest().build();
        }

        else if(this.usuarioRepository.findByEmail_Value(usuarioRequestDTO.getEmail()) == null){}
        String encryptedPassword = new BCryptPasswordEncoder().encode(usuarioRequestDTO.getSenha());
        UsuarioModel usuario = UsuarioModel.builder()
            .nome(usuarioRequestDTO.getNome())
            .cpf(new CPF (usuarioRequestDTO.getCpf()))
            .email(new Email(usuarioRequestDTO.getEmail()))
            .senha(new Senha(encryptedPassword))
            .role(usuarioRequestDTO.getRole())
            .build();
        this.usuarioRepository.save(usuario);
        return ResponseEntity.ok().build();

    }
    }
    