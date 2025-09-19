package com.engenhariadesoftware.e_comercecafe.Models;

import com.engenhariadesoftware.e_comercecafe.ValueObjects.*;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(nullable = false, length = 100)
    private String nome;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "cpf", nullable = false, unique = true, length = 11))
    private CPF cpf;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "email", nullable = false, unique = true, length = 100))
    private Email email;

    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "senha", nullable = false))
    private Senha senha;

    @Column(nullable = false, length = 20)
    @Builder.Default
    private String tipo = "cliente";

    @Column(name = "created_at", nullable = false)
    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    // 🔗 Relacionamentos
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EnderecoModel> enderecos;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private CarrinhoModel carrinho;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PedidoModel> pedidos;
}
