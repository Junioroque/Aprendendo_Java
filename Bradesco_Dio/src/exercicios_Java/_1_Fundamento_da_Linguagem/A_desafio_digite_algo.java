package exercicios_Java._1_Fundamento_da_Linguagem;

import java.util.Scanner;

public class A_desafio_digite_algo {
/*
  Escreva um código que receba o nome e o ano de nascimento de alguém
  e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome?");
        String fulando = scanner.nextLine();

        System.out.println("Digite sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Olá " +fulando+" você tem " +idade+ " anos");

        scanner.close();

    }
}
