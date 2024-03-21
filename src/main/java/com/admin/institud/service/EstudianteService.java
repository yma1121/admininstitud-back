package com.admin.institud.service;

import com.admin.institud.entity.EstudianteEntity;
import com.admin.institud.entity.PersonaEntity;
import com.admin.institud.repository.EstudianteRepository;
import com.admin.institud.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;
    @Autowired
    private PersonaRepository personaRepository;

    public EstudianteEntity registro(EstudianteEntity registro) {
        PersonaEntity persona = personaRepository.save(registro.getPersona());
        registro.setPersona(persona);
        estudianteRepository.save(registro);
        return registro;
    }

    public List<EstudianteEntity> findAll() {
        return estudianteRepository.findAll();
    }
}
