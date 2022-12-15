package org.example;

public class Pessoa {
    String nome;
    String sobreNome;
    int idade;

    public Pessoa(int idade, String nome, String sobreNome){
        this.idade = idade;
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    String andar(){
        return nome+" esta andando";
    }
}
