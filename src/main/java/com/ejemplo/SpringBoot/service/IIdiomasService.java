package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Idiomas;
import java.util.List;


public interface IIdiomasService {
    
    public List<Idiomas> verIdiomas( );
    public void crearIdiomas (Idiomas idi);
    public void borrarIdiomas (Long id);
    public Idiomas buscarIdiomas (Long id);
    
    }
