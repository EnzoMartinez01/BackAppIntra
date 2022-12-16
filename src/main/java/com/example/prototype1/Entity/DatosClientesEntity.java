package com.example.prototype1.Entity;

import javax.persistence.*;

@Entity
@Table(name = "datosclientes")
public class DatosClientesEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer codcliente;
    private String nombcliente;
    private String apellcliente;
    private Integer dni;
    private String correocliente;

    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public String getNombcliente() {
        return nombcliente;
    }

    public void setNombcliente(String nombcliente) {
        this.nombcliente = nombcliente;
    }

    public String getApellcliente() {
        return apellcliente;
    }

    public void setApellcliente(String apellcliente) {
        this.apellcliente = apellcliente;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getCorreocliente() {
        return correocliente;
    }

    public void setCorreocliente(String correocliente) {
        this.correocliente = correocliente;
    }



}
