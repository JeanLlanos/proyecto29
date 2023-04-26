package com.proyecto29.sia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto29.sia.modelo.Personas;

public interface PersonasRepositorio extends JpaRepository<Personas, Long>{
    
}
