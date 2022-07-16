package com.portfolio.lucianosdri.service;

import com.portfolio.lucianosdri.model.Formacion;
import java.util.List;


public interface IFormacionService {
     public List<Formacion> readFormacion ();
    public Formacion addFormacion (Formacion forma);
    public void deleteFormacion (Long idForm);
    public Formacion findForma (Long idForm);
    public Formacion editFormacion (Formacion forma);
    
}
