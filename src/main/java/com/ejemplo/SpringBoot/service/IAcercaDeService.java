package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.AcercaDe;
import java.util.List;


public interface IAcercaDeService {
    
    public List<AcercaDe> verAcercaDes( );
    public void crearAcercaDe (AcercaDe ace);
    public void borrarAcercaDe (Long id);
    public AcercaDe buscarAcercaDe (Long id);
    
    }
