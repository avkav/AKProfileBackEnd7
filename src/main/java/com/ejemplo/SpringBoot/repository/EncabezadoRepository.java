package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Encabezado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncabezadoRepository  extends JpaRepository  <Encabezado, Long> {
    
}
