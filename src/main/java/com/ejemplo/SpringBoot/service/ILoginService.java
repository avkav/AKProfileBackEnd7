package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Login;
import java.util.List;


public interface ILoginService {
    
    public List<Login> verLogins( );
    public void crearLogin (Login log);
    public void borrarLogin (Long id);
    public Login buscarLogin (Long id);
    
    }
