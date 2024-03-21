package com.admin.institud.controller;

import com.admin.institud.entity.RegistroEntity;
import com.admin.institud.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registro")
@CrossOrigin(origins = "*")
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @PostMapping
    public RegistroEntity create(@RequestBody RegistroEntity registro) {
        return registroService.registro(registro);
    }

    @GetMapping
    public List<RegistroEntity> read() {

        return null;
    }

    @PutMapping
    public RegistroEntity update(@RequestBody RegistroEntity registro) {

        return null;
    }

    @DeleteMapping("/{id}")
    public RegistroEntity delete(@RequestParam("id") String idresgitro) {

        return null;
    }
}
