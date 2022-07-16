package com.portfolio.lucianosdri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private Long idPro;
    private String url_proyecto;
    private String descripcion;
    private String url_imagen;

    public Proyectos(){
    
    }
    public Proyectos(Long idPro, String url_proyecto, String descripcion, String url_imagen) {
        this.idPro = idPro;
        this.url_proyecto = url_proyecto;
        this.descripcion = descripcion;
        this.url_imagen = url_imagen;
    }
    
    
}
