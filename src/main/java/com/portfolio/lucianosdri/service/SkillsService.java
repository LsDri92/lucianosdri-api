package com.portfolio.lucianosdri.service;

import com.portfolio.lucianosdri.model.Skills;
import com.portfolio.lucianosdri.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class SkillsService implements ISkillsService {
    
       @Autowired
    SkillsRepository skillRepo;
    
    @Override
    public List<Skills> readSkills() {
        return skillRepo.findAll();
    }
    
    @Override
    public Skills addSkills (Skills skill) {
      return  skillRepo.save(skill);
    }
    
    @Override
    public void deleteSkills (Long idSkill) {
        skillRepo.deleteById(idSkill);
    }
    
    @Override
    public Skills findSkills(Long id) {
        Skills skills = skillRepo.findById(id).orElse(null);
        return skills;
    }
    
    @Override
    public Skills editSkills (Skills skill) {
      return  skillRepo.save(skill);
    }
}
