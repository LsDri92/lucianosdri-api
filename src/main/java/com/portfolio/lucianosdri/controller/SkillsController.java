package com.portfolio.lucianosdri.controller;

import com.portfolio.lucianosdri.model.Skills;
import com.portfolio.lucianosdri.service.ISkillsService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SkillsController {

    @Autowired
    private ISkillsService skillsServ;

    List<Skills> listSkills = new ArrayList();

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/api/skills/add")
    public ResponseEntity<Skills> addSkills(@RequestBody Skills skill) {
        Skills newSkill = skillsServ.addSkills(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }

    @GetMapping("/api/skills/read")
    public ResponseEntity<List<Skills>> readSkills() {
        List<Skills> skillss = skillsServ.readSkills();
        return new ResponseEntity<>(skillss, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/api/skills/delete/{idSkill}")
    public void deleteSkills(@PathVariable Long idSkill) {
        skillsServ.deleteSkills(idSkill);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/api/skills/edit")
    public ResponseEntity<Skills> editarSkill(@RequestBody Skills skills) {
        Skills updateSkill = skillsServ.editSkills(skills);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);
    }

}
