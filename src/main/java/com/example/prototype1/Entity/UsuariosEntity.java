package com.example.prototype1.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.orm.jpa.EntityManagerHolder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;

@Entity
@Table ( name = "usuarios")
public class UsuariosEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuarios;


    private String username;
    @Column (name = "passworduser")
    private String password;
    private String nombuser;
    private String apelluser;
    private String emailuser;
    private String telefuser;

    public Integer getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(Integer idusuarios) {
        this.idusuarios = idusuarios;
    }

    public Set<UsuarioRolEntity> getUsuariorolentity() {
        return usuariorolentity;
    }

    public void setUsuariorolentity(Set<UsuarioRolEntity> usuariorolentity) {
        this.usuariorolentity = usuariorolentity;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombuser() {
        return nombuser;
    }

    public void setNombuser(String nombuser) {
        this.nombuser = nombuser;
    }

    public String getApelluser() {
        return apelluser;
    }

    public void setApelluser(String apelluser) {
        this.apelluser = apelluser;
    }

    public String getEmailuser() {
        return emailuser;
    }

    public void setEmailuser(String emailuser) {
        this.emailuser = emailuser;
    }

    public String getTelefuser() {
        return telefuser;
    }

    public void setTelefuser(String telefuser) {
        this.telefuser = telefuser;
    }

    public String getPerfiluser() {
        return perfiluser;
    }

    public void setPerfiluser(String perfiluser) {
        this.perfiluser = perfiluser;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    private String perfiluser;
    @Column (name = "enableuser")
    private boolean enable = true;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "usuariorol")
    @JsonIgnore
    private Set<UsuarioRolEntity> usuariorolentity = new HashSet<>();

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

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<Authority> autorizacion = new HashSet<>();
        this.usuariorolentity.forEach(usuarioRolEntity -> {
            autorizacion.add(new Authority(usuarioRolEntity.getRolusuario().getNombrol()));
        });
        return autorizacion;
    }

    public UsuariosEntity(){

    }

}

