package com.example.prototype1.Controller;

import com.example.prototype1.Entity.DatosClientesEntity;
import com.example.prototype1.Interface.DatosClientesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/datocliente")
public class DatosClienteController {
    @Autowired
    private DatosClientesInterface datosClientesInterface;

    @GetMapping ("/listar")
    public List<DatosClientesEntity> buscardatoscliente(){
        return (List<DatosClientesEntity>) datosClientesInterface.findAll();
    }

    @PostMapping ("/insertar")
    public void crearDatosClientes (@RequestBody DatosClientesEntity DatCliEnt){
        datosClientesInterface.save(DatCliEnt);
    }

    @PutMapping ("/modificar")
    public void actualizarDatosClientes (@RequestBody DatosClientesEntity DatCliEnt){
        datosClientesInterface.save(DatCliEnt);
    }

    @DeleteMapping (value = "/eliminar/{id}")
    public void eliminarDatosCliente (@PathVariable ("id") Integer id){
        datosClientesInterface.deleteById(id);
    }

    @PutMapping (value = "/modificardato/{id}")
    public ResponseEntity<DatosClientesEntity> actualizarDatosClienteID (@PathVariable ("id") Integer id, @RequestBody DatosClientesEntity DatCliEntJson){
        DatosClientesEntity DatCliEntBD = datosClientesInterface.findById(id).orElseThrow();
        if (!(DatCliEntJson.getCodcliente() == null)) {
            DatCliEntBD.setCodcliente(DatCliEntJson.getCodcliente());
        }
        if(!(DatCliEntJson.getNombcliente() == null)){
            DatCliEntBD.setNombcliente(DatCliEntJson.getNombcliente());
        }
        if(!(DatCliEntJson.getApellcliente() == null)){
            DatCliEntBD.setApellcliente(DatCliEntJson.getApellcliente());
        }
        if(!(DatCliEntJson.getDni() == null)){
            DatCliEntBD.setDni(DatCliEntJson.getDni());
        }
        if(!(DatCliEntJson.getCorreocliente() == null)){
            DatCliEntBD.setCorreocliente(DatCliEntJson.getCorreocliente());
        }
        DatosClientesEntity DatCliEntBDActu = datosClientesInterface.save(DatCliEntBD);
        return ResponseEntity.ok(DatCliEntBDActu);
    }
}
