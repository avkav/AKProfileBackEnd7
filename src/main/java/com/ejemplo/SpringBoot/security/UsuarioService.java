package com.ejemplo.SpringBoot.security;
//package com.ejemplo.SpringBoot.security.service;

//import com.ejemplo.SpringBoot.security.entity.Usuario;
//import com.ejemplo.SpringBoot.security.repository.UsuarioRepository;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional //para mantener la coherencia en la DB en la creación de tablas - si hay error esto hace roll back
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
