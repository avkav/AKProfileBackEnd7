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
public class Habilidades implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String name;
    private String institution;
    private String skillDate;
    
    
    public Habilidades(){
    
}
    
    public Habilidades(Long id, String name, String institution, String skillDate) {
        
        this.id = id;
        this.name= name;
        this.institution= institution;  
        this.skillDate= skillDate;  
    }

    public Habilidades(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
