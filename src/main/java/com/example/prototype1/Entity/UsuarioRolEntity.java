package com.example.prototype1.Entity;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
@Table(name = "userrol")
public class UsuarioRolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuariorol;

    @ManyToOne (fetch = FetchType.EAGER)
    private UsuariosEntity usuariorol;
    @ManyToOne(fetch = FetchType.EAGER)
    private RolEntity rolusuario;


    public Integer getIdusuariorol() {
        return idusuariorol;
    }

    public void setIdusuariorol(Integer idusuariorol) {
        this.idusuariorol = idusuariorol;
    }

    public UsuariosEntity getUsuariorol() {
        return usuariorol;
    }

    public void setUsuariorol(UsuariosEntity usuariorol) {
        this.usuariorol = usuariorol;
    }

    public RolEntity getRolusuario() {
        return rolusuario;
    }

    public void setRolusuario(RolEntity rolusuario) {
        this.rolusuario = rolusuario;
    }
}

