package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.AcercaDe;
import com.ejemplo.SpringBoot.repository.AcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeService implements IAcercaDeService {

    @Autowired //anotattion que nos permite hacer injección de dependencias
   public  AcercaDeRepository acercRepo;
    
    @Override
    public List<AcercaDe> verAcercaDes() {
          return acercRepo.findAll();
    }

    @Override
    public void crearAcercaDe(AcercaDe ace) {
         acercRepo.save(ace);  
    }

    @Override
    public void borrarAcercaDe(Long id) {
         acercRepo.deleteById(id);   
    }

    @Override
    public AcercaDe buscarAcercaDe(Long id) {
        return  acercRepo.findById(id).orElse(null);
}
    
    
}