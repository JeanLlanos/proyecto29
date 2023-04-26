package com.proyecto29.sia.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto29.sia.modelo.Personas;
import com.proyecto29.sia.repositorio.PersonasRepositorio;

@RestController
@RequestMapping("/api/v1/personas")
public class PersonasControlador {
    

    @Autowired
    private PersonasRepositorio personasRepositorio;


    @GetMapping
    ResponseEntity<?> listar() {
        return new ResponseEntity<List<Personas>>(personasRepositorio.findAll(), 
        HttpStatus.OK);
    }

}
