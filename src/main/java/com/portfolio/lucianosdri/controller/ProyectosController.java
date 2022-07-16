package com.portfolio.lucianosdri.controller;

import com.portfolio.lucianosdri.model.Proyectos;

import com.portfolio.lucianosdri.service.IProyectosService;

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

public class ProyectosController {

    @Autowired
    private IProyectosService proyeServ;

    List<Proyectos> listProyectos = new ArrayList();

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/api/proyectos/add")
    public void addProyectos(@RequestBody Proyectos proye) {
        proyeServ.addProyectos(proye);
    }

    @GetMapping("/api/proyectos/read")
    public ResponseEntity<List<Proyectos>> readProyectos() {
        List<Proyectos> proyectoss = proyeServ.readProyectos();
        return new ResponseEntity<>(proyectoss, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/api/proyectos/delete/{idPro}")
    public void deleteProyectos(@PathVariable Long idPro) {
        proyeServ.deleteProyectos(idPro);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/api/proyectos/edit")
    public void editProyectos(@RequestBody Proyectos proye) {
        proyeServ.editProyectos(proye);
    }

    @GetMapping("/api/proyectos/traer")
    public Proyectos getNoteById(@PathVariable(value = "id") Long Id) {
        return proyeServ.findProyectos(Id);

    }

}
