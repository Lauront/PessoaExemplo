package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        TelaDeCadastroDePessoa telaDeCadastroDePessoa = new TelaDeCadastroDePessoa();
        telaDeCadastroDePessoa.pegarDadosUsuario();
        telaDeCadastroDePessoa.informarDadosParaUsuario();

        //System.out.println("Informe a data de nascimento no padrão dd/MM/yyyy");
        //pessoa.dataNascimento = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    }
}
