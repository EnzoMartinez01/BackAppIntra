package com.example.prototype1.Services;

import com.example.prototype1.Entity.CategoriaEntity;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CategoriaService {

    CategoriaEntity agregarCategoria(CategoriaEntity categoria);

    CategoriaEntity actualizarCategoria(CategoriaEntity categoria);

    Set<CategoriaEntity> obtenerCategorias();

    CategoriaEntity obtenerCategoria(Long categoriaId);

    void eliminarCategoria(Long categoriaId);
}