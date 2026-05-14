package com.example.crudUsuarioGameInteliJ.Service;

import com.example.crudUsuarioGameInteliJ.Model.modelGamer;
import com.example.crudUsuarioGameInteliJ.Repository.repositoryGamer;
import lombok.RequiredArgsConstructor;
import java.util.List;

public class serviceGamer {


    @Service
    @RequiredArgsConstructor
    public class GamerService {
        private final repositoryGamer repository;
        // READ — listar todas (era listar() no PessoaDAO)
        public List<modelGamer.Gamer> listar() {
            return repository.findAll();
        }
        // READ — buscar por ID
        public modelGamer.Gamer buscarPorId(Long id) {
            return repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Gamer nao encontrada"));
        }
        // CREATE — inserir (era inserir() no PessoaDAO)
        public modelGamer.Gamer salvar(modelGamer.Gamer gamer) {
            return repository.save(gamer);
        }
        // UPDATE — atualizar (era atualizar() no PessoaDAO)
        public modelGamer.Gamer atualizar(Long id, modelGamer.Gamer dados) {
            modelGamer.Gamer pessoa = buscarPorId(id);
            pessoa.setNickname(dados.getNickname());
            pessoa.setNivel(dados.getNivel());
            pessoa.setEmail(dados.getEmail());
            pessoa.setJogoFavorito(dados.getJogoFavorito());

            return repository.save(pessoa);
        }
        // DELETE — excluir (era excluir() no PessoaDAO)
        public void excluir(Long id) {
            repository.deleteById(id);
        }
    }

}
