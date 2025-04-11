package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Grupo;
import me.dio.academia.digital.entity.form.GrupoForm;
import me.dio.academia.digital.entity.form.GrupoUpdateForm;
import me.dio.academia.digital.repository.GrupoRepository;
import me.dio.academia.digital.service.IGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoServiceImpl implements IGrupoService {

    @Autowired
    private GrupoRepository repository;

    @Override
    public Grupo create(GrupoForm form) {

        Grupo grupo = new Grupo();
        grupo.setDescricao(form.getDescricao());

        return repository.save(grupo);
    }

    @Override
    public Grupo get(Long id) {
        return null;
    }

    @Override
    public List<Grupo> getAll() {

        return repository.findAll();
    }

    @Override
    public Grupo update(Long id, GrupoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

//    @Override
//    public List<Exercicio> getAllGrupoId(Long id) {
//        return List.of();
//    }
}
