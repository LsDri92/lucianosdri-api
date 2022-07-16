package com.portfolio.lucianosdri.controller;

import com.portfolio.lucianosdri.model.Persona;
import com.portfolio.lucianosdri.service.IPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonaController {

    @Autowired
    private IPersonaService persoServ;

    List<Persona> listPersona = new ArrayList();

    @PostMapping("/api/persona/add")
    public void addPersona(@RequestBody Persona perso) {
        persoServ.addPersona(perso);
    }

    @GetMapping("/api/persona/read")
    @ResponseBody
    public List<Persona> readPersona() {
        return persoServ.readPersona();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/api/persona/delete/{id}")
    public void deletePersona(@PathVariable Long id) {
        persoServ.deletePersona(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/api/persona/edit")
    public void editPersona(@RequestBody Persona perso) {
        persoServ.editPersona(perso);
    }

    @GetMapping("/api/persona/traer")
    public Persona findPersona() {
        return persoServ.findPersona((long) 1);
    }

}
