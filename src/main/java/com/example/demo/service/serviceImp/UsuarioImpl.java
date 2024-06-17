package com.example.demo.service.serviceImp;

import com.example.demo.entity.Alumno;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioImpl implements UsuarioService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<Alumno> getAllUser() {

        return userRepository.findAll();
    }

    @Override
    public Optional<Alumno> getById(Integer id) {
        return userRepository.findById(Long.valueOf(id));
    }

    @Override
    public Alumno creatUser(Alumno alumno) {
        return userRepository.save(alumno);
    }

    @Override
    public Alumno updateUser(Integer id, Alumno alumno) {
        Optional<Alumno> inf=userRepository.findById(Long.valueOf(id));
        if (inf.isPresent()){
            Alumno alumn=new Alumno();
            alumn.setId(alumno.getId());
            alumn.setNombreCompleto(alumno.getNombreCompleto());
            alumn.setEdad(alumno.getEdad());
            alumn.setGradoActual(alumno.getGradoActual());
            alumn.setAlumnoExtrangero(alumno.getAlumnoExtrangero());
           return userRepository.save(alumn);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
