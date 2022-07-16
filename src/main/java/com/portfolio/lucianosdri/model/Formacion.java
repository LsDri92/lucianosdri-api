package com.portfolio.lucianosdri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Formacion {
   
   
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private Long idForm;
    private String titulo;
    private String institucion;
    private String ciudad;
    private int ano_inicio;
    private int ano_final;
    private String descripcion;

    public Formacion(){
    
    }
    public Formacion(Long idForm, String titulo, String institucion, String ciudad, int ano_inicio, int ano_final, String descripcion) {
        this.idForm = idForm;
        this.titulo = titulo;
        this.institucion = institucion;
        this.ciudad = ciudad;
        this.ano_inicio = ano_inicio;
        this.ano_final = ano_final;
        this.descripcion = descripcion;
    }
    
    
}
