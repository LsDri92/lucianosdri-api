package com.portfolio.lucianosdri.controller;

import com.portfolio.lucianosdri.model.Exp_laboral;
import com.portfolio.lucianosdri.service.IExp_LaboralService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
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

@RestController

public class Exp_laboralController {

    @Autowired
    private IExp_LaboralService expeServ;

    List<Exp_laboral> listExperiencia = new ArrayList();

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/api/explaboral/add")
    public ResponseEntity<Exp_laboral> addSkills(@RequestBody Exp_laboral expe) {
        Exp_laboral newExpe = expeServ.addExperiencia(expe);
        return new ResponseEntity<>(newExpe, HttpStatus.CREATED);
    }

    @GetMapping("/api/explaboral/read")
    public ResponseEntity<List<Exp_laboral>> readExperencia() {
        List<Exp_laboral> expes = expeServ.readExperiencia();
        return new ResponseEntity<>(expes, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/api/explaboral/delete/{idExp}")
    public void deleteExperiencia(@PathVariable Long idExp) {
        expeServ.deleteExperiencia(idExp);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/api/explaboral/edit")
    public ResponseEntity<Exp_laboral> editarExperiencia(@RequestBody Exp_laboral expe) {
        Exp_laboral updateExpe = expeServ.editExperiencia(expe);
        return new ResponseEntity<>(updateExpe, HttpStatus.OK);
    }
}
