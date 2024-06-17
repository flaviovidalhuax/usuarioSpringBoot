package com.example.demo.service.serviceImp;

import com.example.demo.entity.Alumno;
import com.example.demo.entity.UsuarioAsig;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UsuarioAsigRepository;
import com.example.demo.service.UsuarioAsigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioAsigServImpl implements UsuarioAsigService {
    @Autowired(required=true)
    UsuarioAsigRepository usuarioAsigRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UsuarioAsig> findAll() {
        return usuarioAsigRepository.findAll();
    }

    @Override
    public UsuarioAsig creatUser(UsuarioAsig usuarioAsig, Long idUsuario, Long idUsuarioAsig) {
        Optional<Alumno> user =userRepository.findById(idUsuario);
        List<Alumno> lista = null;


        UsuarioAsig usuarioAsig1=new UsuarioAsig();
        usuarioAsig1.setNombres( lista);
        return usuarioAsigRepository.save(usuarioAsig);
    }
}
