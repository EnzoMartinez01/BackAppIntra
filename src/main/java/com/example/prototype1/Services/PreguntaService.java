package com.example.prototype1.Services;
import com.example.prototype1.Entity.ExamenEntity;
import com.example.prototype1.Entity.PreguntaEntity;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface PreguntaService {

    PreguntaEntity agregarPregunta(PreguntaEntity pregunta);

    PreguntaEntity actualizarPregunta(PreguntaEntity pregunta);

    Set<PreguntaEntity> obtenerPreguntas();

    PreguntaEntity obtenerPregunta(Long preguntaId);

    Set<PreguntaEntity> obtenerPreguntasDelExamen(ExamenEntity examen);

    void eliminarPregunta(Long preguntaId);

    PreguntaEntity listarPregunta(Long preguntaId);
}
