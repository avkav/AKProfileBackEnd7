package com.ejemplo.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String name;
    private String description;
    private String url;
    private String projectDate;
    
    public Proyectos(){
    
}
    
    public Proyectos(Long id, String name, String description, String url, String projectDate) {
    
        
    this.id = id;
    this.name = name;
    this.description = description;
    this.url = url;
    this.projectDate = projectDate; 
    }

    public Proyectos(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
