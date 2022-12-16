package com.example.prototype1.Services.Implement;

import com.example.prototype1.Entity.CategoriaEntity;
import com.example.prototype1.Entity.ExamenEntity;
import com.example.prototype1.Repository.ExamenRepository;
import com.example.prototype1.Services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class ExamenServiceImpl implements ExamenService {

    @Autowired
    private ExamenRepository examenRepository;

    @Override
    public ExamenEntity agregarExamen(ExamenEntity examen) {
        return examenRepository.save(examen);
    }

    @Override
    public ExamenEntity actualizarExamen(ExamenEntity examen) {
        return examenRepository.save(examen);
    }

    @Override
    public Set<ExamenEntity> obtenerExamenes() {
        return new LinkedHashSet<>(examenRepository.findAll());
    }

    @Override
    public ExamenEntity obtenerExamen(Long examenId) {
        return examenRepository.findById(examenId).get();
    }

    @Override
    public void eliminarExamen(Long examenId) {
        ExamenEntity examen = new ExamenEntity();
        examen.setExamenId(examenId);
        examenRepository.delete(examen);
    }

    @Override
    public List<ExamenEntity> listarExamenesDeUnaCategoria(CategoriaEntity categoria) {
        return this.examenRepository.findByCategoria(categoria);
    }

    @Override
    public List<ExamenEntity> obtenerExamenesActivos() {
        return examenRepository.findByActivo(true);
    }

    @Override
    public List<ExamenEntity> obtenerExamenesActivosDeUnaCategoria(CategoriaEntity categoria) {
        return examenRepository.findByCategoriaAndActivo(categoria,true);
    }
}
