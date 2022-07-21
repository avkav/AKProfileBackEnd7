package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Encabezado;
import com.ejemplo.SpringBoot.repository.EncabezadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncabezadoService implements IEncabezadoService {

    @Autowired //anotattion que nos permite hacer injección de dependencias
   public  EncabezadoRepository encRepo;
    
    @Override
    public List<Encabezado> verEncabezados() {
          return encRepo.findAll();
    }

    @Override
    public void crearEncabezado(Encabezado enc) {
         encRepo.save(enc);  
    }

    @Override
    public void borrarEncabezado(Long id) {
         encRepo.deleteById(id);   
    }

    @Override
    public Encabezado buscarEncabezado(Long id) {
        return  encRepo.findById(id).orElse(null);
}
    
    
}