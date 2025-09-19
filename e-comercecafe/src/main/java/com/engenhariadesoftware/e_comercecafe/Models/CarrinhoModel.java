package com.engenhariadesoftware.e_comercecafe.Models;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "carrinhos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarrinhoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrinho")
    private Long idCarrinho;

    // 🔗 Relacionamento com usuário
    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private UsuarioModel usuario;

    // 🔗 Relacionamento com itens
    @OneToMany(mappedBy = "carrinho", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarrinhoItemModel> itens;
}
