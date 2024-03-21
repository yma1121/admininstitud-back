package com.admin.institud.service;

import com.admin.institud.entity.InstructorEntity;
import com.admin.institud.entity.PersonaEntity;
import com.admin.institud.repository.InstructorRepository;
import com.admin.institud.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;
    @Autowired
    private PersonaRepository personaRepository;

    public InstructorEntity registro(InstructorEntity registro) {
        personaRepository.save(registro.getPersona());
        instructorRepository.save(registro);
        return registro;
    }

    public List<InstructorEntity> findAll() {
        return instructorRepository.findAll();
    }
}
