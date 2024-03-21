package com.admin.institud.repository;

import com.admin.institud.entity.RegistroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository<RegistroEntity,Integer> {

}
