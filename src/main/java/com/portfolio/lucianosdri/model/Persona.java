package com.portfolio.lucianosdri.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
public class Persona implements Serializable{
    
 
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String nombre;
    private String lugar;
    private String profesion;
    private String descripcion;
    private String link_github;
    private String link_linkedin;
    private String url_foto;
    
    public Persona(){
    
    }

    public Persona(Long id, String nombre, String lugar, String profesion, String descripcion, String link_github, String link_linkedin, String url_foto) {
        this.id = id;
        this.nombre = nombre;
        this.lugar = lugar;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.link_github = link_github;
        this.link_linkedin = link_linkedin;
        this.url_foto = url_foto;
        }
    
    
}
