package com.portfolio.lucianosdri.service;

import com.portfolio.lucianosdri.model.Formacion;
import com.portfolio.lucianosdri.repository.FormacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionService implements IFormacionService {
     
    @Autowired
    FormacionRepository formaRepo;
    
    @Override
    public List<Formacion> readFormacion() {
        return formaRepo.findAll();
    }
    
    @Override
    public Formacion addFormacion (Formacion forma) {
        return formaRepo.save(forma);
    }
    
    @Override
    public void deleteFormacion (Long idForm) {
        formaRepo.deleteById(idForm);
    }
    
    @Override
    public Formacion findForma(Long idForm) {
        Formacion formacion = formaRepo.findById(idForm).orElse(null);
        return formacion;
    }
    
    @Override
    public Formacion editFormacion (Formacion forma) {
        return formaRepo.save(forma);
    }

    
}
