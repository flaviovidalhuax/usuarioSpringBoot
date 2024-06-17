package com.example.demo.controller;

import com.example.demo.entity.Alumno;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UsuiarioCotrroller {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/allUser")
    public ResponseEntity<List<Alumno>> allUSer2(){
         List<Alumno> data=usuarioService.getAllUser();
        return  ResponseEntity.status(HttpStatus.OK).body(data);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Alumno>>  userById(@PathVariable Integer id){
        Optional<Alumno> user=usuarioService.getById(id);
        if(user.isPresent()){
            return  ResponseEntity.status(HttpStatus.OK).body(user);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/save")
    public ResponseEntity<Alumno> saveUser(@RequestBody Alumno alumno){
        Alumno user=usuarioService.creatUser(alumno);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Alumno> updateUser(@PathVariable Integer id,@RequestBody Alumno alumno) {
        Alumno updatedUser = usuarioService.updateUser(id,alumno);
        return ResponseEntity.status(HttpStatus.OK).body(updatedUser);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        usuarioService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
