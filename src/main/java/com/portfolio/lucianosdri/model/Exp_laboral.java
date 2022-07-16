package com.portfolio.lucianosdri.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Exp_laboral {
   
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private Long idExp;
    private String cargo;
    private int ano_inicio;
    private int ano_final;
    private String lugar;
    private String descripcion;
    
    public Exp_laboral(){
    
    }

    public Exp_laboral(Long idExp, String cargo, int ano_inicio, int ano_final, String lugar, String descripcion) {
        this.idExp = idExp;
        this.cargo = cargo;
        this.ano_inicio = ano_inicio;
        this.ano_final = ano_final;
        this.lugar = lugar;
        this.descripcion = descripcion;
    }
    
    
}
