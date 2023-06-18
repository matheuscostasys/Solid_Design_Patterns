package com.Solid.Design_Patterns;

public class Cerveja {
    private String nome;
    private String origem;
    private  String categoria; 

    public Cerveja(String categoria, String nome, String origem) {
        this.categoria = categoria;
        this.nome = nome;
        this.origem = origem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
