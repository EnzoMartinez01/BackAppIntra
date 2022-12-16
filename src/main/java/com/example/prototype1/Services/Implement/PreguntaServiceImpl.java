package com.example.prototype1.Services.Implement;

import com.example.prototype1.Entity.ExamenEntity;
import com.example.prototype1.Entity.PreguntaEntity;
import com.example.prototype1.Repository.PreguntaRepository;
import com.example.prototype1.Services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PreguntaServiceImpl implements PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Override
    public PreguntaEntity agregarPregunta(PreguntaEntity pregunta) {
        return preguntaRepository.save(pregunta);
    }

    @Override
    public PreguntaEntity actualizarPregunta(PreguntaEntity pregunta) {
        return preguntaRepository.save(pregunta);
    }

    @Override
    public Set<PreguntaEntity> obtenerPreguntas() {
        return (Set<PreguntaEntity>) preguntaRepository.findAll();
    }

    @Override
    public PreguntaEntity obtenerPregunta(Long preguntaId) {
        return preguntaRepository.findById(preguntaId).get();
    }

    @Override
    public Set<PreguntaEntity> obtenerPreguntasDelExamen(ExamenEntity examen) {
        return preguntaRepository.findByExamen(examen);
    }

    @Override
    public void eliminarPregunta(Long preguntaId) {
        PreguntaEntity pregunta = new PreguntaEntity();
        pregunta.setPreguntaId(preguntaId);
        preguntaRepository.delete(pregunta);
    }

    @Override
    public PreguntaEntity listarPregunta(Long preguntaId) {
        return this.preguntaRepository.getOne(preguntaId);
    }
}