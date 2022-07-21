package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Habilidades;
import com.ejemplo.SpringBoot.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService {

    @Autowired //anotattion que nos permite hacer injección de dependencias
   public  HabilidadesRepository habRepo;
    
    @Override
    public List<Habilidades> verHabilidades() {
          return habRepo.findAll();
    }

    @Override
    public void crearHabilidades(Habilidades hab) {
         habRepo.save(hab);  
    }

    @Override
    public void borrarHabilidades(Long id) {
         habRepo.deleteById(id);   
    }

    @Override
    public Habilidades buscarHabilidades(Long id) {
        return  habRepo.findById(id).orElse(null);
}
    
    
}