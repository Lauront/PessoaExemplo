package org.example;

import java.util.Scanner;

public class TelaDeCadastroDePessoa {

    //atributos
    Pessoa pessoa;


    //metodos
    void pegarDadosUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua cnh");
        String cnh = scanner.next();
        System.out.println("Informe seu nome");
        String nome = scanner.next();
        System.out.println("Informe seu sobrenome");
        String sobreNome = scanner.next();
        pessoa = new Pessoa(cnh,nome,sobreNome);
    }
    void informarDadosParaUsuario(){
        System.out.println(pessoa.saudacao());
    }
}
