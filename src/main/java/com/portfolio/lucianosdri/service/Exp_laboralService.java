package com.portfolio.lucianosdri.service;

import com.portfolio.lucianosdri.model.Exp_laboral;
import com.portfolio.lucianosdri.repository.Exp_laboralRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Exp_laboralService implements IExp_LaboralService {
    
    @Autowired
    Exp_laboralRepository expeRepo;
    
    @Override
    public List<Exp_laboral> readExperiencia() {
        return expeRepo.findAll();
    }
    
    @Override
    public Exp_laboral addExperiencia (Exp_laboral expe) {
       return expeRepo.save(expe);   
    }
    
    @Override
    public void deleteExperiencia (Long idExp) {
        expeRepo.deleteById(idExp);
    }
    
    @Override
    public Exp_laboral findExpe(Long idExp) {
        Exp_laboral exp_laboral = expeRepo.findById(idExp).orElse(null);
        return exp_laboral;
    }
    
    @Override
    public Exp_laboral editExperiencia (Exp_laboral expe) {
        return expeRepo.save(expe);
    }

}
