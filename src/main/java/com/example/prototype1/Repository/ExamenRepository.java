package com.example.prototype1.Repository;

import com.example.prototype1.Entity.CategoriaEntity;
import com.example.prototype1.Entity.ExamenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamenRepository extends JpaRepository<ExamenEntity,Long> {

    List<ExamenEntity> findByCategoria(CategoriaEntity categoria);

    List<ExamenEntity> findByActivo(Boolean estado);

    List<ExamenEntity> findByCategoriaAndActivo(CategoriaEntity categoria,Boolean estado);
}
