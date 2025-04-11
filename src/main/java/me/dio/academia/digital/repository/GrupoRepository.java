package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

//@Repository
//public interface AlunoRepository extends JpaRepository<Aluno, Long> {
//}

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {

    List<Grupo> findAll();

}

