package com.admin.institud.controller;

import com.admin.institud.entity.ContactenosEntity;
import com.admin.institud.entity.RegistroEntity;
import com.admin.institud.service.ContactenosService;
import com.admin.institud.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contactenos")
public class ContactenosController {

    @Autowired
    private ContactenosService contactenosService;

    @PostMapping
    public ContactenosEntity create(@RequestBody ContactenosEntity contactenos) {
        return contactenosService.contactenos(contactenos);
    }

    @GetMapping
    public List<ContactenosEntity> read() {

        return null;
    }

    @PutMapping
    public ContactenosEntity update(@RequestBody ContactenosEntity contactenos) {

        return null;
    }

    @DeleteMapping("/{id}")
    public ContactenosEntity delete(@RequestParam("id") String idcontactenos) {

        return null;
    }
}

