package com.example.prototype1.Interface;

import com.example.prototype1.Entity.CategoriaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasInterface extends CrudRepository<CategoriaEntity, Integer> {

}
