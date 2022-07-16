package com.portfolio.lucianosdri.service;

import com.portfolio.lucianosdri.model.Proyectos;
import com.portfolio.lucianosdri.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
      @Autowired
    ProyectosRepository proyeRepo;
    
    @Override
    public List<Proyectos> readProyectos() {
        return proyeRepo.findAll();
    }
    
    @Override
    public void addProyectos (Proyectos expe) {
        proyeRepo.save(expe);
    }
    
    @Override
    public void deleteProyectos (Long id) {
        proyeRepo.deleteById(id);
    }
    
    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos proyectos = proyeRepo.findById(id).orElse(null);
        return  proyectos;
    }
    
    @Override
    public void editProyectos (Proyectos proye) {
        proyeRepo.save(proye);
    }
}
