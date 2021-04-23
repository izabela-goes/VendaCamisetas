package br.com.service;

import br.com.model.Funcionario;
import br.com.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class FuncionarioService {

        @Autowired
        private FuncionarioRepository funcionarioRepository;

        public void save(Funcionario funcionario) {
            funcionarioRepository.save(funcionario);
        }

        public List<Funcionario> findAll() {
            return funcionarioRepository.findAll();
        }

        public Optional<Funcionario> findById(String id) {
            return  funcionarioRepository.findById(id);
        }

        public void delete(String id) {
            funcionarioRepository.deleteById(id);
        }
    }

