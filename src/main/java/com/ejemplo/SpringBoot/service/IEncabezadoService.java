package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Encabezado;
import java.util.List;


public interface IEncabezadoService {
    
    public List<Encabezado> verEncabezados( );
    public void crearEncabezado (Encabezado enc);
    public void borrarEncabezado (Long id);
    public Encabezado buscarEncabezado (Long id);
    
    }
