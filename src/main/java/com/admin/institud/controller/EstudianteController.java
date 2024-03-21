package com.admin.institud.controller;

import com.admin.institud.entity.EstudianteEntity;
import com.admin.institud.service.EstudianteService;
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
@RequestMapping("/api/estudiante")
@CrossOrigin(origins = "*")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @PostMapping
    public EstudianteEntity create(@RequestBody EstudianteEntity registro) {
        return estudianteService.registro(registro);
    }

    @GetMapping
    public List<EstudianteEntity> read() {

        return estudianteService.findAll();
    }

    @PutMapping
    public EstudianteEntity update(@RequestBody EstudianteEntity registro) {

        return null;
    }

    @DeleteMapping("/{id}")
    public EstudianteEntity delete(@RequestParam("id") String idresgitro) {

        return null;
    }
}
