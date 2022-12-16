package com.example.prototype1.Services.Implement;

import com.example.prototype1.Entity.UsuariosEntity;
import com.example.prototype1.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServicesImpl implements UserDetailsService {
    @Autowired
    private UsuarioRepository userrepo;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuariosEntity userload = userrepo.findByUsername(username);
        if (userload == null){
            throw new UsernameNotFoundException("Usuario no Encontrado");
        }
        return userload;
    }
}
