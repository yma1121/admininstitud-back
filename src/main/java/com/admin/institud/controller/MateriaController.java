package com.admin.institud.controller;

import com.admin.institud.entity.MateriaEntity;
import com.admin.institud.service.MateriaService;
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
@RequestMapping("/api/materia")
@CrossOrigin(origins = "*")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @PostMapping
    public MateriaEntity create(@RequestBody MateriaEntity registro) {
        return materiaService.registro(registro);
    }

    @GetMapping
    public List<MateriaEntity> read() {

        return materiaService.findAll();
    }

    @PutMapping
    public MateriaEntity update(@RequestBody MateriaEntity registro) {

        return null;
    }

    @DeleteMapping("/{id}")
    public MateriaEntity delete(@RequestParam("id") String idresgitro) {

        return null;
    }
}
