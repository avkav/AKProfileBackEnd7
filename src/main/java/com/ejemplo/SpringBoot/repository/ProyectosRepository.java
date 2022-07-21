
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository  extends JpaRepository  <Proyectos, Long> {
    
}
