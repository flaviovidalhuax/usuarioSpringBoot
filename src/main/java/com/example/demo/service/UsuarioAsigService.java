package com.example.demo.service;

import com.example.demo.entity.UsuarioAsig;
import com.example.demo.repository.UsuarioAsigRepository;

import java.util.List;

public interface UsuarioAsigService {

    List<UsuarioAsig> findAll();

    UsuarioAsig creatUser(UsuarioAsig usuarioAsig, Long idUsuario, Long idUsuarioAsig);
}
