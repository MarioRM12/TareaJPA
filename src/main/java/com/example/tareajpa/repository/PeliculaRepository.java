package com.example.tareajpa.repository;


import com.example.tareajpa.domain.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository  extends JpaRepository<Pelicula,Long> {
}
