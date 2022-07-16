package com.portfolio.lucianosdri.service;

import com.portfolio.lucianosdri.model.Skills;
import java.util.List;


public interface ISkillsService {
    public List<Skills> readSkills ();
    public Skills addSkills (Skills skill);
    public void deleteSkills (Long idSkill);
    public Skills findSkills (Long id);
    public Skills editSkills (Skills skill);
    
}

