package com.admin.institud.service;

import com.admin.institud.entity.ContactenosEntity;
import com.admin.institud.repository.ContactenosRepository;
import com.admin.institud.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactenosService {


    @Autowired
    private ContactenosRepository contactenosRepository;
    @Autowired
    private PersonaRepository personaRepository;

    public ContactenosEntity contactenos(ContactenosEntity contactenosEntity) {
        contactenosEntity = contactenosRepository.save(contactenosEntity);
        return contactenosEntity;
    }
}
