package br.com.controller;

import br.com.constant.Constant;
import br.com.model.Cliente;
import br.com.model.Funcionario;
import br.com.model.Venda;
import br.com.service.ClienteService;
import br.com.service.FuncionarioService;
import br.com.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

    @RestController
    public class VendaController {

        @Autowired
        private VendaService vendaService;

        @Autowired
        private ClienteService clienteService;

        @Autowired
        private FuncionarioService funcionarioService;

        @PostMapping(Constant.API_VENDA)
        public void save(@RequestBody Venda venda) {
            Optional<Cliente> cliente = clienteService.findById(venda.getCliente().getId());
            Optional<Funcionario> funcionario = funcionarioService.findById(venda.getFuncionario().getId());
            venda.setCliente(cliente.get());
            venda.setFuncionario(funcionario.get());
            vendaService.save(venda);
        }

        @GetMapping(Constant.API_VENDA)
        public List<Venda> findAll() {
            return vendaService.findAll();
        }

        @PutMapping(Constant.API_VENDA)
        public void update (@RequestBody Venda venda) {
            vendaService.save(venda);
        }

        @DeleteMapping(Constant.API_VENDA + "/{id}")
        public void delete(@PathVariable("id") String id) {
            vendaService.delete(id);
        }

        @GetMapping(Constant.API_VENDA + "/{id}")
        public Optional<Venda> findById(@PathVariable("id") String id) {
            return vendaService.findById(id);
        }
    }


