package com.example.prototype1.Interface;
import com.example.prototype1.Entity.CuentaClientesEntity;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaClientesInterface extends CrudRepository<CuentaClientesEntity, Integer> {
}
