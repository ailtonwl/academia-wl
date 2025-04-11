package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Grupo;
import me.dio.academia.digital.entity.form.GrupoForm;
import me.dio.academia.digital.entity.form.GrupoUpdateForm;

import java.util.List;

public interface IGrupoService {
  /**
   * Cria um Grupo e salva no banco de dados.
   * @param form - formulário referente aos dados para criação de um Grupo no banco de dados.
   * @return - Grupo recém-criado.
   */
  Grupo create(GrupoForm form);

  /**
   * Retorna um Grupo que está no banco de dados de acordo com seu Id.
   * @param id - id do Grupo que será exibido.
   * @return - Grupo de acordo com o Id fornecido.
   */
  Grupo get(Long id);

  /**
   * Retorna todos os Grupos que estão no banco de dados.
   * @return - Uma lista os Grupos que estão salvas no DB.
   */
  List<Grupo> getAll();

  /**
   * Atualiza o Grupo.
   * @param id - id do Grupo que será atualizado.
   * @param formUpdate - formulário referente aos dados necessários para atualização do Grupo
   * no banco de dados.
   * @return - Grupo recém-atualizado.
   */
  Grupo update(Long id, GrupoUpdateForm formUpdate);

  /**
   * Deleta um Grupo específico.
   * @param id - id do Grupo que será removido.
   */
  void delete(Long id);

//  List<Exercicio> getAllGrupoId(Long id);
}
