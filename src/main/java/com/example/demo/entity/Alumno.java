package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long id;

    private String nombreCompleto;
    private Integer Edad;
    private Integer GradoActual;
    private Boolean AlumnoActivo;
    private Boolean AlumnoExtrangero;




}
