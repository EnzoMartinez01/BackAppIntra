package com.example.prototype1.Repository;

import com.example.prototype1.Entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository <RolEntity,Integer> {

}