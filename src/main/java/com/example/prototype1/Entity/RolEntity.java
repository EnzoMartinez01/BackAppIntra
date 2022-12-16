package com.example.prototype1.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "rol")
public class RolEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idrol;

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public Set<UsuarioRolEntity> getUsuariorolentity() {
        return usuariorolentity;
    }

    public void setUsuariorolentity(Set<UsuarioRolEntity> usuariorolentity) {
        this.usuariorolentity = usuariorolentity;
    }

    public String getNombrol() {
        return nombrol;
    }

    public void setNombrol(String nombrol) {
        this.nombrol = nombrol;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,mappedBy = "rolusuario")
    private Set<UsuarioRolEntity> usuariorolentity = new HashSet<>();

    private String nombrol;



}
