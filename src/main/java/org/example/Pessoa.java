package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    String cnh;
    String nome;
    String sobreNome;
    LocalDate dataNascimento;

    Carro[] carros;

    public Pessoa(String cnh, String nome, String sobreNome){
        this.cnh = cnh;
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    String saudacao(){
        return String.format("Olá, meu nome é %s %s tenho %d anos e de cnh %s", nome, sobreNome,dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS),cnh);
    }
}
