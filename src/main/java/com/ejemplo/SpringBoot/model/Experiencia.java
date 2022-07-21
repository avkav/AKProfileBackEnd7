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
public class Experiencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String position;
    private String company;
    private String img;
    private String mode;
    private String experienceStart;
    private String experienceEnd;
    private String expDescription;
    
    public Experiencia(){
    
}
    
    public Experiencia(Long id,  String position, String company, String img, String mode, String experienceStart,
            String experienceEnd, String expDescription) {
        
    this.id = id;
    this.position = position;
    this.company = company;
    this.img = img;
    this.mode = mode;
    this.experienceStart = experienceStart;
    this.experienceEnd = experienceEnd;
    this.expDescription = expDescription;
    }

    public Experiencia(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
