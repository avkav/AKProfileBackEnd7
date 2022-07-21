package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String school;
    private String img;
    private String title;
    private String schoolStart;
    private String schoolEnd;
    
    public Educacion(){
    
}
    
    public Educacion(Long id, String school, String img, String title, String schoolStart, String schoolEnd) {
    
        this.id = id;
        this.school = school;
        this.img = img;
        this.title = title;
        this.schoolStart= schoolStart;
        this.schoolEnd = schoolEnd;
    }

    public Educacion(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
