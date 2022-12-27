package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    String nome;
    String sobreNome;
    int idade;

    LocalDate dataNascimento;

    Carro[] carros;

    String saudacao(){
        return String.format("Olá, meu nome é %s %s tenho %d anos %n", nome, sobreNome,dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS));
    }
}
