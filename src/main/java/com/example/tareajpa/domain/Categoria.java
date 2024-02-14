package com.example.tareajpa.domain;

import jakarta.persistence.*;
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

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Pelicula> peliculas = new HashSet<>();
}
