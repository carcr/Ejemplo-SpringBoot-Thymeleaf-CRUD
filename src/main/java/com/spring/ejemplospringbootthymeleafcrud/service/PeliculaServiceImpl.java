package com.spring.ejemplospringbootthymeleafcrud.service;

import com.spring.ejemplospringbootthymeleafcrud.model.Pelicula;
import com.spring.ejemplospringbootthymeleafcrud.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService{

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPeliculas() {
        return peliculaRepository.findAll();
    }

    @Override
    public void savePelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public Pelicula getPeliculaById(long id) {
        Optional<Pelicula> optional=peliculaRepository.findById(id);
        Pelicula pelicula=null;
        if(optional.isPresent()){
            pelicula=optional.get();
        }else{
            throw new RuntimeException("Película no encontrado con id: "+id);
        }
        return pelicula;
    }

    @Override
    public void deletePeliculaById(long id) {
        peliculaRepository.deleteById(id);
    }
}
