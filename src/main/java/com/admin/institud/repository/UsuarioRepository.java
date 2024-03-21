package com.admin.institud.repository;

import com.admin.institud.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

    UsuarioEntity findByNombre(String nombre);
}
