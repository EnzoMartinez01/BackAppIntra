package com.example.prototype1.Services.Implement;

import com.example.prototype1.Entity.CategoriaEntity;
import com.example.prototype1.Repository.CategoriaRepository;
import com.example.prototype1.Services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public CategoriaEntity agregarCategoria(CategoriaEntity categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public CategoriaEntity actualizarCategoria(CategoriaEntity categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Set<CategoriaEntity> obtenerCategorias() {
        return new LinkedHashSet<>(categoriaRepository.findAll());
    }

    @Override
    public CategoriaEntity obtenerCategoria(Long categoriaId) {
        return categoriaRepository.findById(categoriaId).get();
    }

    @Override
    public void eliminarCategoria(Long categoriaId) {
        CategoriaEntity categoria = new CategoriaEntity();
        categoria.setCategoriaId(categoriaId);
        categoriaRepository.delete(categoria);
    }
}