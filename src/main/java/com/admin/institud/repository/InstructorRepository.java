package com.admin.institud.repository;

import com.admin.institud.entity.InstructorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<InstructorEntity, Integer> {
}
