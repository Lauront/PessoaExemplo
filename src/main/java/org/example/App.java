package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua cnh");
        System.out.println("Informe seu nome");
        System.out.println("Informe seu sobrenome");
        Pessoa pessoa = new Pessoa(scanner.next(), scanner.next(), scanner.next());

        Carro fusca = new Carro();
        fusca.cor="Branco";
        fusca.marca="VW";
        fusca.placa="LAU2012";
        fusca.motorista = pessoa;

        System.out.println("Informe a data de nascimento no padrão dd/MM/yyyy");
        pessoa.dataNascimento = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(fusca.saudacao());
    }
}
