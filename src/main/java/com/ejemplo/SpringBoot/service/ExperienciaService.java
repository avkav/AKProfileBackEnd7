package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired //anotattion que nos permite hacer injección de dependencias
   public  ExperienciaRepository expRepo;
    
    @Override
    public List<Experiencia> verExperiencias() {
          return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
         expRepo.save(exp);  
    }

    @Override
    public void borrarExperiencia(Long id) {
         expRepo.deleteById(id);   
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return  expRepo.findById(id).orElse(null);
}
    
    
}