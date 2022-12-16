package com.example.prototype1.Controller;

import com.example.prototype1.Config.JwtUtilies;
import com.example.prototype1.Entity.JWTRequest;
import com.example.prototype1.Entity.JWTResponse;
import com.example.prototype1.Entity.UsuariosEntity;
import com.example.prototype1.Services.Implement.UserDetailsServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/autenticacion")
@CrossOrigin("*")
public class AutenticacionController {

    @Autowired
    private UserDetailsServicesImpl userDetail;
    @Autowired
    private AuthenticationManager authenticationM;
    @Autowired
    private JwtUtilies jwtUtilies;

    @GetMapping("/userlogin")
    public UsuariosEntity obtenerUsuario(Principal principal){
        return (UsuariosEntity) userDetail.loadUserByUsername(principal.getName());
    }

    @PostMapping("/generartoken")
    public ResponseEntity<?> generarToken(@RequestBody JWTRequest jwtR) throws Exception{
        try {
            this.autenticar(jwtR.getUsername(), jwtR.getPassword());
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Usuario no Registrado");
        }

        UserDetails userDetails = userDetail.loadUserByUsername(jwtR.getUsername());
        String token = jwtUtilies.generateToken(userDetails);

        return ResponseEntity.ok(new JWTResponse(token));
    }

    public void autenticar (String username, String password) throws Exception {
        try {
            authenticationM.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        }catch (DisabledException e){
            throw new Exception("Usuario Desabilitado " + e);
        }catch (BadCredentialsException be){
            throw new Exception("Credenciales Erroneas " + be);
        }
    }

}
