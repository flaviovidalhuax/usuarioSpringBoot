package com.example.demo.controller;

import com.example.demo.entity.UsuarioAsig;
import com.example.demo.service.UsuarioAsigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userAsig")
public class UsiarioAsigController {
    @Autowired
    UsuarioAsigService usuarioAsigService;
    @GetMapping("/allUsarioAsg")
    public List<UsuarioAsig> obtAllUserAsg(){
        return usuarioAsigService.findAll();
    }
    @PostMapping("/save/{idUsuario}/{idUsuarioAsig}")
    public ResponseEntity<UsuarioAsig> saveUser(@RequestBody UsuarioAsig usuarioAsig, @PathVariable Long idUsuario, @PathVariable Long idUsuarioAsig){
        UsuarioAsig userAsg=usuarioAsigService.creatUser(usuarioAsig, idUsuario, idUsuarioAsig);
        return ResponseEntity.status(HttpStatus.CREATED).body(userAsg);
    }


}
