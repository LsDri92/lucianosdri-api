package com.portfolio.lucianosdri.repository;

import com.portfolio.lucianosdri.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Long>{
    
}
