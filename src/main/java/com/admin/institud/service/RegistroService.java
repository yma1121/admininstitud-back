package com.admin.institud.service;

import com.admin.institud.entity.PersonaEntity;
import com.admin.institud.entity.RegistroEntity;
import com.admin.institud.repository.PersonaRepository;
import com.admin.institud.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {

    @Autowired
    private RegistroRepository registroRepository;
    @Autowired
    private PersonaRepository personaRepository;

    public RegistroEntity registro(RegistroEntity registroEntity) {
        registroEntity = registroRepository.save(registroEntity);
        return registroEntity;
    }
}
