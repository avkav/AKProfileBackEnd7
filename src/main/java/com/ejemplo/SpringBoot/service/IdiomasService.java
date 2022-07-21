package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Idiomas;
import com.ejemplo.SpringBoot.repository.IdiomasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomasService implements IIdiomasService {

    @Autowired //anotattion que nos permite hacer injección de dependencias
   public  IdiomasRepository idiRepo;
    
    @Override
    public List<Idiomas> verIdiomas() {
          return idiRepo.findAll();
    }

    @Override
    public void crearIdiomas(Idiomas idi) {
         idiRepo.save(idi);  
    }

    @Override
    public void borrarIdiomas(Long id) {
         idiRepo.deleteById(id);   
    }

    @Override
    public Idiomas buscarIdiomas(Long id) {
        return  idiRepo.findById(id).orElse(null);
}
    
    
}