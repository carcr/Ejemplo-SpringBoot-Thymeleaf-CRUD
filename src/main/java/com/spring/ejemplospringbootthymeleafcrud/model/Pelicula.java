package com.spring.ejemplospringbootthymeleafcrud.model;

import javax.persistence.*;

@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pelicula;

    @Column(name = "titulo_pelicula")
    private String titulo;

    @Column(name = "director_pelicula")
    private String director;

    public long getId() {
        return id_pelicula;
    }

    public void setId(long id) {
        this.id_pelicula = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
