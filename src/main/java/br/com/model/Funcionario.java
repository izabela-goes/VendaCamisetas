package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

    @Document
    public class Funcionario {

        @Id
        private String _id;
        private  String nome;
        private String telefone;
        private Venda venda;

        public String getId() {
            return _id;
        }

        public void setId(String id) {
            this._id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

    }


