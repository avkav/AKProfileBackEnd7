package com.ejemplo.SpringBoot.security;
//package com.ejemplo.SpringBoot.security.repository;


//import com.ejemplo.SpringBoot.security.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);  //método opcional para obtener un usuario a partir de su nombre
    boolean existsByNombreUsuario(String nombreUsuario);//con el booleano se comprueba si el nombre existe o no
    boolean existsByEmail(String email);//con el booleano se comprueba si el mail existe o no

}