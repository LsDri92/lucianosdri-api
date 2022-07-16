package com.portfolio.lucianosdri.controller;

import com.portfolio.lucianosdri.model.Formacion;
import com.portfolio.lucianosdri.service.IFormacionService;
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

public class FormacionController {

    @Autowired
    private IFormacionService formaServ;

    List<Formacion> listFormacion = new ArrayList();

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/api/formacion/add")
    public ResponseEntity<Formacion> addFormacion(@RequestBody Formacion forma) {
        Formacion newForma = formaServ.addFormacion(forma);
        return new ResponseEntity<>(newForma, HttpStatus.CREATED);
    }

    @GetMapping("/api/formacion/read")
    public ResponseEntity<List<Formacion>> readFormacion() {
        List<Formacion> formacions = formaServ.readFormacion();
        return new ResponseEntity<>(formacions, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/api/formacion/delete/{idForm}")
    public void deleteFormacion(@PathVariable Long idForm) {
        formaServ.deleteFormacion(idForm);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/api/formacion/edit")
    public ResponseEntity<Formacion> editFormacion(@RequestBody Formacion forma) {
        Formacion updateForma = formaServ.editFormacion(forma);
        return new ResponseEntity<>(updateForma, HttpStatus.OK);
    }
}
