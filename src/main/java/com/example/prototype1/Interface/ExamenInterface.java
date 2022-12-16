package com.example.prototype1.Interface;

import com.example.prototype1.Entity.ExamenEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenInterface extends CrudRepository<ExamenEntity, Integer> {

}
