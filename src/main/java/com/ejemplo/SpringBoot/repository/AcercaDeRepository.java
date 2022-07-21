
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepository  extends JpaRepository  <AcercaDe, Long> {
    
}