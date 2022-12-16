package com.example.prototype1.Controller;

import com.example.prototype1.Entity.CuentaClientesEntity;
import com.example.prototype1.Interface.CuentaClientesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/cuentaclientes")
public class CuentaClientesController {
    @Autowired
    private CuentaClientesInterface cuentaClientesInterface;

    @GetMapping
    public List<CuentaClientesEntity> buscarCuentaClientes(){
        return (List<CuentaClientesEntity>) cuentaClientesInterface.findAll();
    }
    @PostMapping
    public void crearCuentaCliente (@RequestBody CuentaClientesEntity CueCliEnt){
        cuentaClientesInterface.save(CueCliEnt);
    }
    @PutMapping
    public void actualizarCuentaCliente (@RequestBody CuentaClientesEntity CueCliEnt){
        cuentaClientesInterface.save(CueCliEnt);
    }
    @DeleteMapping (value = "/{id}")
    public void eliminarCuentaCliente (@PathVariable ("id") Integer id){
        cuentaClientesInterface.deleteById(id);
    }
    @PutMapping (value = "/{id}")
    public ResponseEntity<CuentaClientesEntity> actualizarCuentaClientesID (@PathVariable ("id") Integer id, @RequestBody CuentaClientesEntity CueCliEntJson){
        CuentaClientesEntity CueCliEntBD = cuentaClientesInterface.findById(id).orElseThrow();
        if (!(CueCliEntJson.getCodcliente() == null)){
            CueCliEntBD.setCodcliente(CueCliEntJson.getCodcliente());
        }
        if (!(CueCliEntJson.getCodcuentacliente() == null)){
            CueCliEntBD.setCodcuentacliente(CueCliEntJson.getCodcuentacliente());
        }
        if (!(CueCliEntJson.getNumcuentacliente() == null)){
            CueCliEntBD.setNumcuentacliente(CueCliEntJson.getNumcuentacliente());
        }
        if (!(CueCliEntJson.getTarjetacliente() == null)){
            CueCliEntBD.setTarjetacliente(CueCliEntJson.getTarjetacliente());
        }
        CuentaClientesEntity CuenCliEntBDActu = cuentaClientesInterface.save(CueCliEntBD);
        return ResponseEntity.ok(CuenCliEntBDActu);
    }
}
