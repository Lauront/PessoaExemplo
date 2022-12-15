package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Pessoa pessoaAline = new Pessoa(18,"Aline","Soares");
        Pessoa pessoaVini = new Pessoa(25,"Vini","Doidao");

        System.out.println(pessoaAline.andar());
        System.out.println(pessoaVini.andar());
        System.out.println("A idade do Vini é: "+pessoaVini.idade);

        System.out.println("hello nova branch");
    }
}
