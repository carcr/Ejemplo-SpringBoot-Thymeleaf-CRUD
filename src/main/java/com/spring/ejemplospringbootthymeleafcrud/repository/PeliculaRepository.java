package com.spring.ejemplospringbootthymeleafcrud.repository;

import com.spring.ejemplospringbootthymeleafcrud.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula,Long> {
}
