package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioAsig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuarioAsig")
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "usuario_asig_usuario",
            joinColumns = @JoinColumn(name = "id_usuarioAsig"),
            inverseJoinColumns = @JoinColumn(name = "id_usuario")
    )
    private List<Alumno> nombres;
}
