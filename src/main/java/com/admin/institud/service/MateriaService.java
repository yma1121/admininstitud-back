package com.admin.institud.service;

import com.admin.institud.entity.MateriaEntity;
import com.admin.institud.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    public MateriaEntity registro(MateriaEntity registro) {
        return materiaRepository.save(registro);
    }

    public List<MateriaEntity> findAll() {
        return materiaRepository.findAll();
    }
}
