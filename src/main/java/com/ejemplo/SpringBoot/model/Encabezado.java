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
public class Encabezado implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String name;
    private String backImage;
    private String profileImage; //image
    private String position;
    private String companyName; //company.name
    private String companyImg;
    private String companyUrl;
    private String schoolName;
    private String schoolImg;
    private String schoolUrl;
    private String ubication;

    
    
    
    public Encabezado(){
    
}
    
    public Encabezado(Long id, String name, String backImage, String profileImage, String position, String companyName, 
            String companyImg, String companyUrl, String schoolName, String schoolImg, String schoolUrl, String ubication) {
    
    this.id = id;
    this.name = name;
    this.backImage= backImage;
    this.profileImage=profileImage; //image
    this.position=position;
    this.companyName=companyName;
    this.companyImg=companyImg;
    this.companyUrl=companyUrl;
    this.schoolName=schoolName;
    this.schoolImg=schoolImg;
    this.schoolUrl=schoolUrl;
    this.ubication=ubication;            
    }

    public Encabezado(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
