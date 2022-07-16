package com.portfolio.lucianosdri.repository;

import com.portfolio.lucianosdri.model.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormacionRepository extends JpaRepository<Formacion, Long>{
    
}
