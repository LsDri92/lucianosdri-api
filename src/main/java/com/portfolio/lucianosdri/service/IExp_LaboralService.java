
package com.portfolio.lucianosdri.service;

import com.portfolio.lucianosdri.model.Exp_laboral;
import java.util.List;


public interface IExp_LaboralService {
    public List<Exp_laboral> readExperiencia ();
    public Exp_laboral addExperiencia (Exp_laboral expe);
    public void deleteExperiencia (Long idExp);
    public Exp_laboral findExpe (Long idExp);
    public Exp_laboral editExperiencia (Exp_laboral expe);
    
}

