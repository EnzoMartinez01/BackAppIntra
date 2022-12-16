package com.example.prototype1.Interface;

import com.example.prototype1.Entity.PreguntaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaInterface extends CrudRepository<PreguntaEntity, Integer> {

}
