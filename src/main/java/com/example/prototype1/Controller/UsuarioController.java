package com.example.prototype1.Controller;

import com.example.prototype1.Entity.RolEntity;
import com.example.prototype1.Entity.UsuarioRolEntity;
import com.example.prototype1.Entity.UsuariosEntity;
import com.example.prototype1.Repository.UsuarioRepository;
import com.example.prototype1.Services.Implement.UsuarioServicesImp;
import com.example.prototype1.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping ("/usuario")
@CrossOrigin("http://localhost:4200/")
public class UsuarioController {
    @Autowired
    private UsuarioServicesImp userServImpl;
    @Autowired
    private UsuarioService userServ;

    @Autowired
    private UsuarioRepository userRepo;



    @GetMapping (value = "/{username}")
    public UsuariosEntity obtenerUsuario (@PathVariable ("username") String username){
        return userServImpl.obtenerUsuarioService(username);
    }

    @GetMapping ("/listarUsuario")
    public List<UsuariosEntity> busquedaDatoUsuario (){
        return (List<UsuariosEntity>) userRepo.findAll();
    }

    @PostMapping("/registrarusuario")
    public UsuariosEntity agregarUsuario(@RequestBody UsuariosEntity userJsonEntity) throws Exception{
        Set<RolEntity> rolEnt = new HashSet<>();
        Set<UsuarioRolEntity> userRolEnt = new HashSet<>();

        RolEntity rol = new RolEntity();
        rol.setIdrol(1);
        rol.setNombrol("Estudiante");

        UsuarioRolEntity userrol = new UsuarioRolEntity();
        userrol.setUsuariorol(userJsonEntity);
        userrol.setRolusuario(rol);

        userRolEnt.add(userrol);
        return userServImpl.guardarUsuarioService(userJsonEntity, userRolEnt);
    }
}
