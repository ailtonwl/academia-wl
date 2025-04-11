package me.dio.academia.digital.controller;

import jakarta.validation.Valid;
import me.dio.academia.digital.entity.Grupo;
import me.dio.academia.digital.entity.form.GrupoForm;
import me.dio.academia.digital.service.impl.GrupoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {

    @Autowired
    private GrupoServiceImpl service;

    @PostMapping
    public Grupo create(@Valid @RequestBody GrupoForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Grupo> getAll() {
        return service.getAll();
    }
}
