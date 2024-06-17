package com.example.demo.service;

import com.example.demo.entity.Alumno;

import java.util.List;
import java.util.Optional;

public interface UsuarioService{

    List<Alumno> getAllUser();

    Optional<Alumno> getById(Integer id);

    Alumno creatUser(Alumno alumno);

    Alumno updateUser( Integer id,Alumno alumno);

    void deleteUser(Long id);
}
