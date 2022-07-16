package com.portfolio.lucianosdri.service;

import com.portfolio.lucianosdri.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> readPersona ();
    public void addPersona (Persona perso);
    public void deletePersona (Long id);
    public Persona findPersona (Long id);
    public void editPersona (Persona perso);
    
}
