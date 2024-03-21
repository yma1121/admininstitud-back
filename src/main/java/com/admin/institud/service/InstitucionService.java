package com.admin.institud.service;

import com.admin.institud.entity.InstitucionEntity;
import com.admin.institud.repository.InstitucionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitucionService {

    @Autowired
    private InstitucionRepository institucionRepository;

    public InstitucionEntity registro(InstitucionEntity registro) {
        InstitucionEntity institucion = institucionRepository.save(registro);
        return institucion;
    }

    public List<InstitucionEntity> findAll() {
        return institucionRepository.findAll();
    }
}
