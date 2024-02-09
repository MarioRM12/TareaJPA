package com.example.tareajpa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Categoria {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private long id;

    private String titulo;

    @ManyToMany(mappedBy = "categorias")
    private Set<Pelicula> peliculas = new HashSet<>();
}
