package com.example.prototype1.Repository;

import com.example.prototype1.Entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@Repository
public interface UsuarioRepository extends JpaRepository <UsuariosEntity,Integer> {
    public UsuariosEntity findByUsername (String username);


}