
package com.portfolio.lucianosdri.service;

import com.portfolio.lucianosdri.model.Proyectos;
import java.util.List;


public interface IProyectosService {
      public List<Proyectos> readProyectos ();
    public void addProyectos (Proyectos proye);
    public void deleteProyectos (Long id);
    public Proyectos findProyectos (Long id);
    public void editProyectos (Proyectos proye);
    
}

