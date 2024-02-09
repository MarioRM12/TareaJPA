package com.example.tareajpa;

import com.example.tareajpa.domain.Categoria;
import com.example.tareajpa.domain.Pelicula;
import com.example.tareajpa.repository.CategoriaRepository;
import com.example.tareajpa.repository.PeliculaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class TareaJpaApplicationTests {

    @Autowired
    PeliculaRepository peliculaRepository;
    @Autowired
    CategoriaRepository categoriaRepository;


    @Test
    void contextLoads() {



    }

    @Test
    void guardarManyToMany(){

        Pelicula pelicula1 = new Pelicula(0, "Pelicula1", new HashSet<>());

        peliculaRepository.save(pelicula1);

        Categoria categoria = new Categoria(0, "Categoria1", new HashSet<>());
        Categoria categoria2 = new Categoria(0, "Categoria2", new HashSet<>());

        categoriaRepository.save(categoria);
        categoriaRepository.save(categoria2);

        pelicula1.getCategorias().add(categoria);
        categoria.getPeliculas().add(pelicula1);
        pelicula1.getCategorias().add(categoria2);
        categoria2.getPeliculas().add(pelicula1);

        peliculaRepository.save(pelicula1);
        categoriaRepository.save(categoria);
        categoriaRepository.save(categoria2);

    }

}
