package com.admin.institud.controller;

import com.admin.institud.entity.InstructorEntity;
import com.admin.institud.service.InstructorService;
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
@RequestMapping("/api/instructor")
@CrossOrigin(origins = "*")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @PostMapping
    public InstructorEntity create(@RequestBody InstructorEntity registro) {
        return instructorService.registro(registro);
    }

    @GetMapping
    public List<InstructorEntity> read() {

        return instructorService.findAll();
    }

    @PutMapping
    public InstructorEntity update(@RequestBody InstructorEntity registro) {

        return null;
    }

    @DeleteMapping("/{id}")
    public InstructorEntity delete(@RequestParam("id") String idresgitro) {

        return null;
    }
}
