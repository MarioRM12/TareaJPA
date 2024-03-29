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
public class Pelicula {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private long id;

    private String titulo;

    @ManyToMany(mappedBy = "peliculas", cascade = CascadeType.ALL)
    private Set<Categoria> categorias = new HashSet<>();

}
