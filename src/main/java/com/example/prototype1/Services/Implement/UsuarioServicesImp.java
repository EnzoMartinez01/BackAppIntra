package com.example.prototype1.Services.Implement;

import com.example.prototype1.Entity.UsuarioRolEntity;
import com.example.prototype1.Entity.UsuariosEntity;
import com.example.prototype1.Repository.RolRepository;
import com.example.prototype1.Repository.UsuarioRepository;
import com.example.prototype1.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioServicesImp implements UsuarioService {

    @Autowired
    private UsuarioRepository userRep;

    @Autowired
    private RolRepository rolRep;

    @Override
    public UsuariosEntity guardarUsuarioService (UsuariosEntity usuariosJson, Set<UsuarioRolEntity> usuarioRolController) throws Exception{
        UsuariosEntity userLocal = userRep.findByUsername(usuariosJson.getUsername());
        if (userLocal != null){
            System.out.println("Usuario ya existe");
        }
        else {
            for(UsuarioRolEntity usuarioRolEntity:usuarioRolController){
                rolRep.save(usuarioRolEntity.getRolusuario());
            }
            usuariosJson.getUsuariorolentity().addAll(usuarioRolController);
            userLocal = userRep.save(usuariosJson);
        }
        return userLocal;
    }

    @Override
    public UsuariosEntity obtenerUsuarioService(String username) {

        return userRep.findByUsername(username);
    }

    @Override
    public void eliminarUsuarioService(int idusuarios) {
    }


}
