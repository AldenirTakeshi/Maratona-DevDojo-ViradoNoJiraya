package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo:");
        String nome = input.nextLine();
        System.out.println("Digite seu idade:");
        String idade = input.nextLine();
        System.out.println("Digite M ou F seu sexo:");
        char sexo = input.next().charAt(0);
        System.out.println("-------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
