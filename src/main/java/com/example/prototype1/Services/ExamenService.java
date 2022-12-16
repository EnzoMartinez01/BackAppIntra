package com.example.prototype1.Services;

import com.example.prototype1.Entity.CategoriaEntity;
import com.example.prototype1.Entity.ExamenEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface ExamenService {

    ExamenEntity agregarExamen(ExamenEntity examen);

    ExamenEntity actualizarExamen(ExamenEntity examen);

    Set<ExamenEntity> obtenerExamenes();

    ExamenEntity obtenerExamen(Long examenId);

    void eliminarExamen(Long examenId);

    List<ExamenEntity> listarExamenesDeUnaCategoria(CategoriaEntity categoria);

    List<ExamenEntity> obtenerExamenesActivos();

    List<ExamenEntity> obtenerExamenesActivosDeUnaCategoria(CategoriaEntity categoria);
}
