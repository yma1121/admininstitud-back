package com.admin.institud.repository;

import com.admin.institud.entity.MateriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<MateriaEntity, Integer> {
}
