package com.example.prototype1.Controller;

import com.example.prototype1.Entity.CategoriaEntity;
import com.example.prototype1.Services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriasController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/agregar")
    public ResponseEntity<CategoriaEntity> guardarCategoria(@RequestBody CategoriaEntity categoria){
        CategoriaEntity categoriaGuardada = categoriaService.agregarCategoria(categoria);
        return ResponseEntity.ok(categoriaGuardada);
    }

    @GetMapping("/{categoriaId}")
    public CategoriaEntity listarCategoriaPorId(@PathVariable("categoriaId") Long categoriaId){
        return categoriaService.obtenerCategoria(categoriaId);
    }

    @GetMapping("/obtener")
    public ResponseEntity<?> listarCategorias(){
        return ResponseEntity.ok(categoriaService.obtenerCategorias());
    }
    @PutMapping("/modificar")
    public CategoriaEntity actualizarCategoria(@RequestBody CategoriaEntity categoria){
        return categoriaService.actualizarCategoria(categoria);
    }
    @DeleteMapping("/eliminar/{categoriaId}")
    public void eliminarCategoria(@PathVariable("categoriaId") Long categoriaId){
        categoriaService.eliminarCategoria(categoriaId);
    }
}
