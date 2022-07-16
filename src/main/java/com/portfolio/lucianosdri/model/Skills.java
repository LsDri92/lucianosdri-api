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
public class Skills implements Serializable {
   
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private Long idSkill;
    private String url_logo;
    private String nombre;
    private String descripcion;
    
    public Skills(){
    
    }

    public Skills(Long idSkill, String url_logo, String nombre, String descripcion) {
        this.idSkill = idSkill;
        this.url_logo = url_logo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
}
