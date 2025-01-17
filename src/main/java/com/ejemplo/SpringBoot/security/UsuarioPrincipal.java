package com.ejemplo.SpringBoot.security;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class UsuarioPrincipal implements UserDetails {
    
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private Collection <? extends GrantedAuthority> authorities;

    public UsuarioPrincipal(String nombre, String nombreUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public static UsuarioPrincipal build(Usuario usuario){
        List<GrantedAuthority>authorities = 
                usuario.getRoles().stream().map (rol -> new SimpleGrantedAuthority(rol
                        .getRolNombre().name())).collect(Collectors.toList());
        return new UsuarioPrincipal(usuario.getNombre(), usuario.getNombreUsuario(), usuario.getEmail(),
        usuario.getPassword(), authorities);
    }
    //con este constructor se convierte un usuario común en un usuario con privilegios de admin
    
    
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
        }

    @Override
    public String getPassword() {
        return password;
                }

    @Override
    public String getUsername() {
       return nombreUsuario  ;
               }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    
}

//esta clase es la encargada de la seguridad - implementa privilegios de cada usuario
//aquí no se crea entidad en la base de datos, con lo cual no posee id
//En lugar de tener la clase rol, como en el caso de la calse Usuario, se tiene autoridades
