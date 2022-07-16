package com.portfolio.lucianosdri.service;

import com.portfolio.lucianosdri.model.Persona;
import com.portfolio.lucianosdri.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    PersonaRepository persoRepo;
    
    @Override
    public List<Persona> readPersona() {
        return persoRepo.findAll();
    }
    
    @Override
    public void addPersona (Persona perso) {
        persoRepo.save(perso);
    }
    
    @Override
    public void deletePersona (Long id) {
        persoRepo.deleteById(id);
    }
    
    @Override
    public Persona findPersona(Long id) {
        Persona persona = persoRepo.findById(id).orElse(null);
        return persona;
    }
    
    @Override
    public void editPersona (Persona perso) {
        persoRepo.save(perso);
    }
    

    
}
