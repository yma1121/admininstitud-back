package com.admin.institud.controller;

import com.admin.institud.entity.InstitucionEntity;
import com.admin.institud.entity.RegistroEntity;
import com.admin.institud.service.InstitucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/institucion")
@CrossOrigin(origins = "*")
public class InstitucionController {

    @Autowired
    private InstitucionService institucionService;

    @PostMapping
    public InstitucionEntity create(@RequestBody InstitucionEntity registro) {
        return institucionService.registro(registro);
    }

    @GetMapping
    public List<InstitucionEntity> read() {

        return institucionService.findAll();
    }

    @PutMapping
    public InstitucionEntity update(@RequestBody InstitucionEntity registro) {

        return null;
    }

    @DeleteMapping("/{id}")
    public InstitucionEntity delete(@RequestParam("id") String idresgitro) {

        return null;
    }
}
