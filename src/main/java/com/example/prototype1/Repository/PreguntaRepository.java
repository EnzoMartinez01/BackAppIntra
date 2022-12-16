package com.example.prototype1.Repository;

import com.example.prototype1.Entity.ExamenEntity;
import com.example.prototype1.Entity.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PreguntaRepository extends JpaRepository<PreguntaEntity,Long> {
    Set<PreguntaEntity> findByExamen(ExamenEntity examen);
}
