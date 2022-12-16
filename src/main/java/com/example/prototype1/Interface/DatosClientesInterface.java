package com.example.prototype1.Interface;
import com.example.prototype1.Entity.DatosClientesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosClientesInterface extends CrudRepository<DatosClientesEntity, Integer> {


}
