package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Funcionario;
import br.com.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
    public class FuncionarioController {

        @Autowired
        private FuncionarioService funcionarioService;

        @PostMapping(Constant.API_FUNCIONARIO)
        public void save(@RequestBody Funcionario funcionario) {
            funcionarioService.save(funcionario);
        }

        @GetMapping(Constant.API_FUNCIONARIO)
        public List<Funcionario> findAll() {
            return funcionarioService.findAll();
        }

        @PutMapping(Constant.API_FUNCIONARIO)
        public void update (@RequestBody Funcionario funcionario) {
            funcionarioService.save(funcionario);
        }

        @DeleteMapping(Constant.API_FUNCIONARIO + "/{id}")
        public void delete(@PathVariable("id") String id) {
            funcionarioService.delete(id);
        }

        @GetMapping(Constant.API_FUNCIONARIO + "/{id}")
        public Optional<Funcionario> findById(@PathVariable("id") String id) {
            return funcionarioService.findById(id);
        }
}

