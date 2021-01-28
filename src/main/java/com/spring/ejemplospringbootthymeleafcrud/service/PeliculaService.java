package com.spring.ejemplospringbootthymeleafcrud.service;

import com.spring.ejemplospringbootthymeleafcrud.model.Pelicula;

import java.util.List;

public interface PeliculaService {

    List<Pelicula> getAllPeliculas();
    void savePelicula(Pelicula pelicula);
    Pelicula getPeliculaById(long id);
    void deletePeliculaById(long id);
}
