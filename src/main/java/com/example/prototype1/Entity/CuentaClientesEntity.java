package com.example.prototype1.Entity;

import javax.persistence.*;
@Entity
@Table(name = "cuentaclientes")
public class CuentaClientesEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer codcuentacliente;
    private Integer codcliente;
    private String numcuentacliente;
    private String tarjetacliente;

    public Integer getCodcuentacliente() {
        return codcuentacliente;
    }

    public void setCodcuentacliente(Integer codcuentacliente) {
        this.codcuentacliente = codcuentacliente;
    }

    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public String getNumcuentacliente() {
        return numcuentacliente;
    }

    public void setNumcuentacliente(String numcuentacliente) {
        this.numcuentacliente = numcuentacliente;
    }

    public String getTarjetacliente() {
        return tarjetacliente;
    }

    public void setTarjetacliente(String tarjetacliente) {
        this.tarjetacliente = tarjetacliente;
    }
}
