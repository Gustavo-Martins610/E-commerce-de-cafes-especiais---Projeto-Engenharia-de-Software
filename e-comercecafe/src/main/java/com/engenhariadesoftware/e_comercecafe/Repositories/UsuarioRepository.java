package com.engenhariadesoftware.e_comercecafe.Repositories;

import com.engenhariadesoftware.e_comercecafe.Models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
    Optional<UsuarioModel> findByEmail(String email);
    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
}

