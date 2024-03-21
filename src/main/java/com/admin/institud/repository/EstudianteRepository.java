package com.admin.institud.repository;

import com.admin.institud.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity, Integer> {
}
