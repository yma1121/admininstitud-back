package com.admin.institud.repository;

import com.admin.institud.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity,Integer> {
}
