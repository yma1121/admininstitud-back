package com.admin.institud.controller;

import com.admin.institud.entity.NotaEntity;
import com.admin.institud.service.NotasService;
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
@RequestMapping("/api/notas")
@CrossOrigin(origins = "*")
public class NotasController {
    @Autowired
    private NotasService notasService;

    @PostMapping
    public NotaEntity create(@RequestBody NotaEntity registro) {
        return notasService.registro(registro);
    }

    @GetMapping
    public List<NotaEntity> read() {

        return null;
    }

    @PutMapping
    public NotaEntity update(@RequestBody NotaEntity registro) {

        return null;
    }

    @DeleteMapping("/{id}")
    public NotaEntity delete(@RequestParam("id") String idresgitro) {

        return null;
    }
}
