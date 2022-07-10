package com.mycompany.model;


public class Pessoa {
    
    private final String sexo;    
    private final String nome;
    private final String estadoCivil;

    public Pessoa(String sexo, String nome, String estadoCivil) {
        this.sexo = sexo;
        this.nome = nome;
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
    
}
