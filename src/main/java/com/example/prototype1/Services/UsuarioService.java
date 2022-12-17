package com.example.prototype1.Services;

import com.example.prototype1.Entity.UsuarioRolEntity;
import com.example.prototype1.Entity.UsuariosEntity;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public interface UsuarioService {
    /*PostUsuario*/
    public UsuariosEntity guardarUsuarioService (UsuariosEntity usuariosEntity, Set<UsuarioRolEntity> usuarioRolEntity) throws Exception;

    /*GetUsuario*/
    public UsuariosEntity obtenerUsuarioService (String username);

    /*Metodo $$$$$$*/
    public void eliminarUsuarioService (int idusuarios);


}
