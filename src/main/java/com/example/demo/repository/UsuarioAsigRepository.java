package com.example.demo.repository;

import com.example.demo.entity.UsuarioAsig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioAsigRepository extends JpaRepository<UsuarioAsig, Long> {
}
