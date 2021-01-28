package com.spring.ejemplospringbootthymeleafcrud.controller;

import com.spring.ejemplospringbootthymeleafcrud.model.Pelicula;
import com.spring.ejemplospringbootthymeleafcrud.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listaPeliculas",peliculaService.getAllPeliculas());
        return "index";
    }

    @GetMapping("/showNewPeliculaForm")
    public String showNewPeliculaForm(Model model) {
        Pelicula pelicula = new Pelicula();
        model.addAttribute("pelicula", pelicula);
        return "new_pelicula";
    }

    @PostMapping("/savePelicula")
    public String savePelicula(@ModelAttribute("pelicula") Pelicula pelicula){
        peliculaService.savePelicula(pelicula);
        return "redirect:/";
    }
}

