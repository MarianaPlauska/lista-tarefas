package br.com.mariana.tarefas.service;

import br.com.mariana.tarefas.model.Tarefa;

import java.util.List;

public interface TarefaService {
    List<Tarefa> listarTarefas();
    void adicionarTarefa(String nome, double custo, String dataLimite);
    void editarTarefa(Long id, String nome, double custo, String dataLimite);
    void excluirTarefa(Long id);
    void subir(Long tarefaId);
    void descer(Long tarefaId);
}
