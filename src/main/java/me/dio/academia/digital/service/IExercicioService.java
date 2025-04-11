package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Exercicio;
import me.dio.academia.digital.entity.form.ExercicioForm;
import me.dio.academia.digital.entity.form.ExercicioUpdateForm;

import java.util.List;

public interface IExercicioService {
  /**
   * Cria um Exercicio e salva no banco de dados.
   *
   * @param form - formulário referente aos dados para criação da Avaliação Física no banco de dados.
   * @return - Avaliação Física recém-criada.
   */
  Exercicio create(ExercicioForm form);

  /**
   * Retorna um Exercicio que está no banco de dados de acordo com seu Id.
   * @param id - id da Avaliação Física que será exibida.
   * @return - Exercicio de acordo com o Id fornecido.
   */
  Exercicio get(Long id);

  /**
   * Retorna todas as Exercicio que estão no banco de dados.
   * @return - Uma lista com todas as Exercicio que estão salvas no DB.
   */
  List<Exercicio> getAll();

  /**
   * Atualiza a Exercicio.
   * @param id - id da Exercicio que será atualizada.
   * @param formUpdate - formulário referente aos dados necessários para atualização da Avaliação
   * Física no banco de dados.
   * @return - Exercicio recém-atualizada.
   */
  Exercicio update(Long id, ExercicioUpdateForm formUpdate);

  /**
   * Deleta uma Exercicio específica.
   * @param id - id da Exercicio que será removida.
   */
  void delete(Long id);
}
